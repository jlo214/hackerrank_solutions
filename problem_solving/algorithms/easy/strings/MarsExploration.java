/*
jlo214
03/2020
https://www.hackerrank.com/challenges/mars-exploration/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {

    static int marsExploration(String s) {

        int counter = 0;
        int length = s.length();
        
        for(int i=0; i<length; i+=3){
            if(s.charAt(i+0) != 'S' )
                counter++;
            
            if(s.charAt(i+1) != 'O' )
                counter++;
            
            if(s.charAt(i+2) != 'S' )
                counter++;           
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}