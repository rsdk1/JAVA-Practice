import java.util.Scanner;

  public class New {
    public static void main(String[] args)
       {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word: ");
        String original = s.nextLine();
        String reverse = " ";


        for (int i = original.length() - 1; i >= 0; i--)
        {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse))
        {
            System.out.println("Palindrome!");
        } else
        {
            System.out.println("Not a palindrome.");
        }
    }
}
