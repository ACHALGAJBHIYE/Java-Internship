/*
 
Both number should be different

Input Format

First line contain input1 Second line contain input2

Constraints

-

Output Format

Print greatest of two number, if number is same, print Invalid Input
 

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int large = a>b ? a : b;
            System.out.println(large);
        }
    }
}