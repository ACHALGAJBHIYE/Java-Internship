/*
Program to check largest of two number in different way.
Input from user.
*/

import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();

        //  Using if else
         if(num1 > num2)
        {
            System.out.println("Greatest Number = " + num1);
        }
        else
        {
            System.out.println("Greatest Number = "+ num2)
        }

        //  Using ternary operator
        int largest =  num1>num2 ? num1 : num2;

        System.out.println("Greatest = " + largest);
        

    }
}
