/*
 Program to check Digit or Not, If their is all Digit then return "1" otherwise return "0"
 */
public class CheckDigit{
    public static void main(String[] args) {
        String s = "986154";
        boolean f = true;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
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