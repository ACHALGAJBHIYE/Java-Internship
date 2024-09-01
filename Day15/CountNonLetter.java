/*
  Program to count Non-Letter from the String
 */
public class CountNonLetter
{
    public static void main(String[] args) {
        String s = "hel$lo%wor ld";
        boolean f = true;
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(!Character.isLetter(s.charAt(i))){
                count++;
                f =false;
            }
        }
        System.out.println(count);
    }
}