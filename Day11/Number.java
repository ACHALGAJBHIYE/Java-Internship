/*
  Check 4 digit numbervor not, if Yes print sum of all digit otherwise -1
 */
import java.util.Scanner;
public class Number
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
            System.out.println("Sum = "+(w+x+y+z));    
        } 
        else{
            System.out.println("-1");
        }
        
    }
}