/*
    Program to Sort the Number In Decending Order
 */
import java.util.Scanner;
import java.util.Arrays;
public  class SortInReverseOrder{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        //Integer to String
        String num = Integer.toString(n);

        //String to char array
        char ch[] = num.toCharArray();

        //Sort array in assending order
        Arrays.sort(ch);

        // Character array to string
        String num2 = new String(ch);

        //Stringbuilder to use reverse function
        StringBuilder sb = new StringBuilder(num2);
        sb = sb.reverse();
        
        System.out.println("Number in Desending order = "+sb);
    }
}
