import java.util.Scanner;

public class Fib
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fibonacci nos. to print: ");
        int n = scan.nextInt();

        int first = 0, second = 1;

        System.out.print("Fib Series: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scan.close();
    }
}
