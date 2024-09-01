/*
   Program to toggle letter from UpperCase to LowerCase and LowerCase to UpperCase 
 */
public class ToggleString{
    public static void main(String[] args){
        String s = "heLLoWoRlzD";
        String w = "";

        for(int i=0; i<=s.length()-1; i++){
            if(Character.isLetter(s.charAt(i))){
                if(Character.isLowerCase(s.charAt(i))){
                    w = w + Character.toUpperCase(s.charAt(i));
                }else{
                    w = w + Character.toLowerCase(s.charAt(i));
                }
            }else{
                System.out.println("Invalid Input");
            }
        }
        System.out.println(w);
    }
}