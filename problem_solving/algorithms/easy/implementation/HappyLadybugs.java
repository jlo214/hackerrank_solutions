/*
jlo214
06/2020
https://www.hackerrank.com/challenges/happy-ladybugs/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HappyLadybugs {

    static String happyLadybugs(String b) {
        //mix of solo and look up
        int[] counts = new int[26];
        boolean singleLadyBug = false;
        boolean happyString = true;
        
        //check if string is already happy
        for(int i=0; i<b.length()-1; i++){
            if(i==0 && b.charAt(i) != b.charAt(i+1))
                happyString = false;            
            else if(i!=0 && b.charAt(i-1) != b.charAt(i) && b.charAt(i) != b.charAt(i+1) )
                happyString = false;            
        }
        
        //check if it's possible to make string happy 
        for(int i=0; i<b.length(); i++){
            if (b.charAt(i) != '_'){
                int index = (int) b.charAt(i) - 'A';
                counts[index]++;
            }
        }
        for(int i: counts){
            if(i == 1) 
            	singleLadyBug = true;
        }
        
        //check if it has at least one empty space '_'
        boolean emptySpace = b.contains("_") ? true : false;

        //returns 
        if(singleLadyBug)
            return "NO";        
        else if(happyString)
            return "YES";        
        else if(emptySpace)
            return "YES";
        
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();
            String result = happyLadybugs(b);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}