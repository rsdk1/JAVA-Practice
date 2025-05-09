public class Main{
    public static void main(String[] args) {

        float a = 1.5f, b= 1.8f;
        System.out.println("Before swapping: a = "+ a +", b =" +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Before swapping: a = "+ a +", b =" + b);


    }
}