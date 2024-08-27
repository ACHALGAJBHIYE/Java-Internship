/*
  Fibonacci series = sum of last two Number is next Number

  Program to print the digit of number in Fibonacci series
 */
import java.util.Scanner;
public class Fibonacci2
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=1; i<=n-2; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}    