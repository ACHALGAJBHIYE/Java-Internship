/*

Write a program to add 2 numbers

Input Format

First Line should contain input 1 Second Line should contain input 2

Constraints

-

Output Format

Output should be some of two number in positive If sum is negative, convert into positive


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
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int add = num1 + num2;
         add = Math.abs(add);
         System.out.println(add);
    }
}