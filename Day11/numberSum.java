/*
  If the digit is even add to sumEven
  else add to sumOdd
 */
import java.util.Scanner;
public class numberSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        while(num != 0)
        {
            int d = num % 10;
            if(d % 2 == 0){
                sumEven = sumEven + d;
            }else{
                sumOdd = sumOdd + d;
            }
           num = num / 10;
        }
        System.out.println("Sum of even number = "+sumEven);
        System.out.println("Sum of odd number = "+sumOdd);
    }
}