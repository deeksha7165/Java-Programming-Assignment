import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double c = sc.nextDouble();

        double total = a + b + c;
        double average = total / 3;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}
