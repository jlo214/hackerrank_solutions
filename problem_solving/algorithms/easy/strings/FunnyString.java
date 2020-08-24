/*
jlo214
04/2020
https://www.hackerrank.com/challenges/funny-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {

    static String funnyString(String s) {

        StringBuffer reverse = new StringBuffer();
        int[] asciiS = new int[s.length()];
        int[] asciiR = new int[s.length()];
        int[] sDiff = new int[s.length()];
        int[] rDiff = new int[s.length()];
        boolean funny = true;
        
        for(int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        
        for(int j=0; j<s.length(); j++){
            asciiS[j] = s.charAt(j); 
            asciiR[j] = reverse.charAt(j);
        }
        
        for(int k=0; k<asciiR.length-1; k++){
            sDiff[k] = Math.abs(asciiS[k] - asciiS[k+1]);
            rDiff[k] = Math.abs(asciiR[k] - asciiR[k+1]);
        }
        
        for(int p=0; p<sDiff.length; p++){
            if(sDiff[p] != rDiff[p])
                funny = false;            
        }
       
        if(funny)
            return "Funny";          
        
        return "Not Funny";          
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}
