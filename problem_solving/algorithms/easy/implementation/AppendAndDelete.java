/*
jlo214
05/2020
https://www.hackerrank.com/challenges/append-and-delete/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        //looked up from minOpReq and below, had right idea, picked wrong length from condition, had to correct
        int len = s.length()>t.length() ? t.length() : s.length();
        int matchCount = 0;
        
        for(int i=0; i<len; i++){
            if(s.charAt(i) == t.charAt(i))
                matchCount++;            
            else
                break;            
        }
        
        int minOpReq = s.length() + t.length() - 2 * matchCount;

        if (k == minOpReq)
            return "Yes";        
        else if (k > minOpReq && (k-minOpReq) % 2 == 0 || k > s.length()+t.length())
            return "Yes";
        
        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
