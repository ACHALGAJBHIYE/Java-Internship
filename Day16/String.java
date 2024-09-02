import java.lang.*;
public class String{
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s1 == s5);//false
        System.out.println(s4.equals(s5));//true

    }
}
/*
   1. Heap memory consist String constant pool.
   2. STring constant pool is small memory in Heap memory.
   3. In string constant pool if already object is created new object is pointing to that object.
   4. In string constant pool automatic garbage collection id occur.
   5. Grarbage collection use **gc()** function which delete unwanted memory space.
   6. s4.equals(s5); this function is use to compare two string.
 */