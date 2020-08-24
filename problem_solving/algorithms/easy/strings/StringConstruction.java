/*
jlo214
04/2020
https://www.hackerrank.com/challenges/string-construction/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringConstruction {

    static int stringConstruction(String s) {
		//solo
       	String p = "";
       	int sLength = s.length();
       	int cost = 0;
       
       	for(int i=0; i<sLength; i++){
           String tempString = String.valueOf( s.charAt(i) );
           
           if( !p.contains(tempString) ){
               p = p + tempString;
               cost++;
           }
       }
       return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}