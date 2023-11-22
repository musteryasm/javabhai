import java.util.Scanner;

public class MazeRunner {
    // Maze dimensions
    private static final int MAZE_SIZE = 5;
    private static final char EMPTY = ' ';
    private static final char WALL = '#';
    private static final char EXIT = 'E';
    private static final char PLAYER = 'P';

    private static char[][] maze = {
            {WALL, WALL, WALL, WALL, WALL},
            {WALL, EMPTY, EMPTY, EMPTY, WALL},
            {WALL, EMPTY, WALL, EMPTY, WALL},
            {WALL, EMPTY, WALL, EMPTY, EXIT},
            {WALL, WALL, WALL, WALL, WALL}
    };

    private static int playerRow = 1;
    private static int playerCol = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Maze Runner!");

        while (true) {
            printMaze();

            System.out.print("Enter your move (U/D/L/R): ");
            String move = scanner.next();

            if (isValidMove(move)) {
                movePlayer(move);
                if (hasReachedExit()) {
                    System.out.println("Congratulations! You reached the exit.");
                    break;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private static void printMaze() {
        for (int i = 0; i < MAZE_SIZE; i++) {
            for (int j = 0; j < MAZE_SIZE; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(String move) {
        switch (move.toUpperCase()) {
            case "U":
                return maze[playerRow - 1][playerCol] != WALL;
            case "D":
                return maze[playerRow + 1][playerCol] != WALL;
            case "L":
                return maze[playerRow][playerCol - 1] != WALL;
            case "R":
                return maze[playerRow][playerCol + 1] != WALL;
            default:
                return false;
        }
    }

    private static void movePlayer(String move) {
        maze[playerRow][playerCol] = EMPTY;

        switch (move.toUpperCase()) {
            case "U":
                playerRow--;
                break;
            case "D":
                playerRow++;
                break;
            case "L":
                playerCol--;
                break;
            case "R":
                playerCol++;
                break;
        }

        maze[playerRow][playerCol] = PLAYER;
    }

    private static boolean hasReachedExit() {
        return maze[playerRow][playerCol] == EXIT;
    }
}

