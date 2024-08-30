/*
  Program to Remove Digit 
 */
import java.util.Scanner;
public class RemoveDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Enter Number U want to Remove:");
        int n1 = sc.nextInt();

        // Convert Integer to String
        String num = Integer.toString(n);
        //Replace "" to remove digit
        num = num.replace(Integer.toString(n1),"");
        int num2 = Integer.parseInt(num);

        System.out.println(num2);
        
    }
}