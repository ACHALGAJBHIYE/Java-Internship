// Programe to check Number is Palinddrome or not using StringBuilder
// Method 2
import java.util.Scanner;
public class PalindromeNumber2
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number");
        int originalNum = sc.nextInt();

        String num = Integer.toString(originalNum);

        StringBuilder sb = new StringBuilder(num);
        StringBuilder rev = sb.reverse();

        String s = new String(rev);
        boolean result = s.equals(num);
        System.out.println(result);
        if(result){
            System.out.println("Palindreme Nmuber");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}