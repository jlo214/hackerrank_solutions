/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-strings-introduction/problem
*/
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int result = a.length()+b.length();
        System.out.println(result);
        
        int compareResults = a.compareTo(b);
        if(compareResults > 0)
            System.out.println("Yes");             
        else
            System.out.println("No");                     
        
        String finalString = String.valueOf(Character.toUpperCase(a.charAt(0))) + a.substring(1,a.length()) +" "+ String.valueOf(Character.toUpperCase(b.charAt(0))) + b.substring(1,b.length());
        System.out.println(finalString);       
    }
}