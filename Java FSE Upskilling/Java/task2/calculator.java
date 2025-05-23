import java.util.Scanner;

public class calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0; 
        }
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator c = new calculator();

        System.out.println("Enter your choice:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + c.addition(a, b));
                break;
            case 2:
                System.out.println("Result: " + c.subtraction(a, b));
                break;
            case 3:
                System.out.println("Result: " + c.multiplication(a, b));
                break;
            case 4:
                System.out.println("Result: " + c.division(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close(); 
    }
}
