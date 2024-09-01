/*
 Program to count special Character
 */
public class CountSpecialLetter{
    public static void main(String[] args){
        String s = "hel ld";
        boolean f = true;
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(!Character.isWhitespace(s.charAt(i))){
                count++;
                f =false;
            }
        }
        System.out.println(count);
    }
}