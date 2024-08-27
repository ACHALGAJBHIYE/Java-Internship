/*
  Program to print largest digit of Number take by user
 */
import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int largest = n%10;
        while(n!=0)
        {
            int d = n%10;
            if(d>largest)
            {
                largest  = d;
            }
            n/=10;
        }
        System.out.println("Largest number = "+largest);
    }
}