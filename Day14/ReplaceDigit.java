/*
  Program to Replace Digit by Any user define Number
 */
import java.util.Scanner;
public class ReplaceDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to replace:");
        int n1 = sc.nextInt();
        System.out.println("Replace With: ");
        int n2 = sc.nextInt();   

        //use Integer.toString() function to convert interger to String
        String num = Integer.toString(n);
        num = num.replace(Integer.toString(n1),Integer.toString(n2));
        int num2 = Integer.parseInt(num);
        System.out.println("New Number = "+num2);
        
    }
}