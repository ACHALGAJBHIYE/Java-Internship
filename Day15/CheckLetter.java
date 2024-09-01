/*
 Program to check Letter or not. If all character is letter then return 1 otherwise 0
 */
public class CheckLetter
{
    public static void main(String[] args) {
        String s = "hello world";
        boolean f = true;

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i))){
                f = true;
            }else{
                f =false;
                break;
            }
        }

        if(f){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}