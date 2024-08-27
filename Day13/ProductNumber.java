// TO check Number is divisible by divisor or not

import java.util.Scanner;
public class ProductNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();
        int rem, product=1;
        while(n!=0)
        {
            rem = n%10;
            product = product*rem;
            n = n/10;
        }
        if(product%divisor == 0)
        {
            System.out.println("Divisible");
        }else{
            System.out.println("Not divisible");
        }
    }
}