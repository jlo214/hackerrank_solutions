/*
jlo214
05/2020
https://www.hackerrank.com/challenges/the-time-in-words/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheTimeInWords {

    static String timeInWords(int h, int m) {
        //solo
        //had general idea, but had to lookup 10<m<30 and 30<m<59

        String min = m <= 9 ? "minute" : "minutes";        
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        
        if(m == 0){
            return words[h]+" o' clock";
        }
        else if(m == 15){
            return "quarter past "+words[h];
        }
        else if(m == 30){
            return "half past "+words[h];
        }
        else if(m == 45){
            return "quarter to "+words[h+1];
        }
        else if(1<=m && m<=29){
            String temp = m<=20 ? words[m] : words[20]+" "+words[m%10];
            return temp +" "+min+" past "+words[h];
        }
        else if(31<=m && m<=59){
            int rMin = 60 - m;
            if(rMin == 1) min = "minute";
            String temp = rMin<=20 ? words[rMin] : words[20]+" "+words[rMin%10];
            return temp +" "+min+" to "+words[h+1];
        }
        return "";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
