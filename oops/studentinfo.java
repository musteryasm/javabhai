class Student {
    String name;
    int roll_no;

    public studentinfo(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Student object with the name "SM" and roll number 79
        Student student = new Student("SM", 79);

        // Displaying information about the student
        System.out.println("Name: " + student.name);
        System.out.println("Roll No: " + student.roll_no);
    }
}
