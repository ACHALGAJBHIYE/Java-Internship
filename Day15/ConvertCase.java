/*
   Program to converte lowerCase Letter to UpperCase  Letter 
 */
public class ConvertCase{
    public static void main(String[] args){
        String s = "hello";
        String w = "";

        for(int i=0; i<=s.length()-1; i++){
            if(Character.isLowerCase(s.charAt(i))){
                w = w + Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(w);
    }
}