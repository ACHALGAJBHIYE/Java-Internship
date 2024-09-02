/*
    Program to toggle string.
    1. if Upper Case then convert to Lower Case.
    2. if Lower Case then Convert to Upper Case.
    3. if Integer then print it's Square.
    4. Otherwise for any symbol print as it is.
 */
public class ConvertCase2{
    public static void main(String[] args){
        String s = "He#lLo WO34rl/D";
        String s1 = "";

        System.out.println(s);
        for(int i=0; i<=s.length()-1; i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                s1 = s1 + (char) (s.charAt(i)-32);
            }else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                s1 = s1 + (char) (s.charAt(i)+32);
            }else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                s1 = s1 + ((s.charAt(i)-'0')*(s.charAt(i)-'0'));
            }else{
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}

/*
  Output - He#lLo WO34rl/D
           hE#LlO wo916RL/d
 */