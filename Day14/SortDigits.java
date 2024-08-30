/*
  Program to sort Number in assending Order
 */
import java.util.Arrays;
import java.util.Scanner;
public class SortDigits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        // Step1 - Convert number to string 
        String num = Integer.toString(n);

        // Step2 - Convert String to Char array
        char ch[] = num.toCharArray();

        // Step3 - Sort Array
        Arrays.sort(ch);
       // System.out.println(ch);

        //optional
        //char array to string 
        String num2 = new String(ch);

        // Conver String to Ingeger
        int n2 = Integer.parseInt(num2);
        System.out.println(n2);
    }
}