// Programe to Check Number is Palindrome or Not 
// Palindrome => original number = Reverse Number
// Method 1
import java.util.Scanner;
public class PalindromeNumber1
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int rem, rev = 0;
        int originalNum = num;
        while(num != 0)
        {
            rem = num %10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(originalNum == rev){
            System.out.println("Palindrom Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}