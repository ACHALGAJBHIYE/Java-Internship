/*
  1. Number should be 4 digit
  2. if evenSum = oddSum then return 1, Otherwise -1
 */
import java.util.Scanner;
public class EvenOddSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit number");
        int n = sc.nextInt();//1234
        if(n<9999 && n>999)
        {
            int w = n%10;//
            int x = n/10%10;
            int y = n/100%10;
            int z = n/1000%10;
            int evenSum = x + z;
            int oddSum = w + y;
           if(evenSum == oddSum){
            System.out.println("1");
           }else{
            System.out.println("0");
           }
        } 
        else{
            System.out.println("-1");
        }
        
    }
}