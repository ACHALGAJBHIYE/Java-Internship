/*
 Program to count WhiteSpace
 */
public class CountWhiteSpace{
    public static void main(String[] args){
        String s = "hello world";
        boolean f = true;
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isWhitespace(s.charAt(i))){
                count++;
                f =false;
            }
        }
        System.out.println(count);
    }
}