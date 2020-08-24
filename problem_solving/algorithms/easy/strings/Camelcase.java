/*
jlo214
03/2020
https://www.hackerrank.com/challenges/camelcase/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Camelcase {

    static int camelcase(String s) {
        int total = 1;
        
        for(int i=0; i<s.length(); i++){   
            if( Character.isUpperCase(s.charAt(i)) )  
                total++;             
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}