/*
jlo214
04/2020
https://www.hackerrank.com/challenges/pangrams/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangrams {

    static String pangrams(String s) {
        s = s.replaceAll(" ","");
        String s1 = "";
        String s2 = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(s1.indexOf(c) == -1) 
            	s1 += c;              
        }

        if(s1.length()==s2.length()) 
        	return "pangram";            

        return "not pangram";            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}