/*
  Fibonacci series = sum of last two number is next number.
  
  Program to print odd number in Fibonacci series
 */
import java.util.Scanner;
public class OddFibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Odd Fibonacci series:");
        System.out.print(1+" ");
        for(int i=1; i<=n-2; i++)
        {
           
            int c = a + b;
            if(c%2!=0){
                System.out.print(c+" ");
            }
            a = b;
            b = c;     
        }
    }
}    