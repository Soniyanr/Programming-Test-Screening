import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        double result;

        switch (operation.toLowerCase()) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;

            case "subtract":
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case "multiply":
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case "divide":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operation type, use: add, subtract, multiply, or divide.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number b: ");
        double b = scanner.nextDouble();

        scanner.nextLine(); 
        System.out.print("Enter operation type add, subtract, multiply, divide: ");
        String operation = scanner.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        scanner.close();
    }
}
