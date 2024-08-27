/*
  1. Number is five digit.
  2. if it isfive digit then return sum otherwise return -1(Invalid)
 */
import java.util.Scanner;

public class SumOf5Digit
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        int n = sc.nextInt();//12345
        if(n<99999 && n>9999)
        {
            int a = n%10;
            int b = n/10%10;
            int c = n/100%10;
            int d = n/1000%10;
            int e = n/10000%10;
            System.out.println("Sum of 5 digit = "+(a+b+c+d+e));    
        }else{
            System.out.println("-1");
        } 
    }
}