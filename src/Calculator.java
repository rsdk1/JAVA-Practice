import java.util.Scanner;
    public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error:Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid");
        }
        scan.close();
    }
}
