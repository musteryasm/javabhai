import java.util.Scanner;

public class GrossNet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter empno: ");
        int empno = scanner.nextInt();
        System.out.print("Enter empname: ");
        String empname = scanner.next();

        System.out.print("Enter basic salary: ");
        double basic = scanner.nextDouble();

        double DA = 0.70 * basic;
        double HRA = 0.30 * basic;
        double PF = 0.10 * basic;

        double grossSalary = basic + DA + HRA + 240;
        double netSalary = grossSalary - PF - 100;

        System.out.println("Empno: " + empno);
        System.out.println("Empname: " + empname);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("CCA: " + 240);
        System.out.println("PF: " + 100);
        System.out.println("PT: " + 100);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
