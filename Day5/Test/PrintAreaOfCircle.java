/*
 
Read Input Radius from User, do not Assume PI value as 3.14, take standerd value using library variable

Input Format

5.6

Constraints

-

Output Format

Print only 2 decimal values in the answer Example

Input 5.6

Output - 98.52

 */


 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.printf("%.2f",area);
    }
}
