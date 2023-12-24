class TablePrinter extends Thread {
private int table;
public TablePrinter(int table) {
this.table = table;
}
@Override
public void run() {
long startTime = System.currentTimeMillis();
System.out.println("Table of " + table + ":");
for (int i = 1; i <= 10; i++) {
System.out.println(table + " x " + i + " = " + (table * i));
}
long endTime = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println("Total time taken for table " + table + ": " +
totalTime + " milliseconds");
}
}
public class Table {
public static void main(String[] args) {
TablePrinter tableOfFive = new TablePrinter(5);
TablePrinter tableOfSeven = new TablePrinter(7);
TablePrinter tableOfThirteen = new TablePrinter(13);
tableOfFive.start();
tableOfSeven.start();
tableOfThirteen.start();
}
}

