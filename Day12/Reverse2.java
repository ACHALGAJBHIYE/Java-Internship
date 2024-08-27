// Programe to resevse the Number using StringBuilder
// Method 2
import java.util.Scanner;
public class Reverse2
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number");
        int originalNum = sc.nextInt();
        String num = Integer.toString(originalNum);
        StringBuilder sb = new StringBuilder(num);
        StringBuilder rev = sb.reverse();
       
        System.out.println("Reverse Number = " + rev);
    }
}