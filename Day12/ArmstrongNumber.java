/*
  Amstrong Number means 
  original Number = sum of power of digitsin that number
 */
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, sum = 0;
        int originalNum = num;
        int i=0;
        //count the digit
        while(num!=0){
            i++;
            num = num/10;
        }
        num = originalNum;
        //sum
        while (num!=0) {
            rem = num%10;
            sum = sum + (int)Math.pow(rem, i);
            num = num/10;
        } 
        if(originalNum == sum)
        {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}