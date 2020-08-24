/*
jlo214
05/2020
https://www.hackerrank.com/challenges/caesar-cipher-1/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        //optimized from O(n^2) brute force to O(n) by looking up solution on discussion
        //solo attempt was close, but I couldn't get the rotation formula w/out inner loop
        k = k % 26;
        StringBuilder encryptMsg = new StringBuilder();
    
        for(int i=0; i<s.length(); i++){
            int curLetter = (int) s.charAt(i);

            if(97 <= curLetter && curLetter <= 122){
                curLetter = curLetter + k;

                if(curLetter > 122)
                        curLetter = 96 + (curLetter - 122);                
            }
            else if(65 <= curLetter && curLetter <= 90){
                curLetter = curLetter + k;

                if(curLetter > 90)
                        curLetter = 64 + (curLetter - 90);                
            }            
            encryptMsg.append((char) curLetter);            
        }
        return encryptMsg.toString();
    }

    /*
    static String caesarCipher(String s, int k) {
        //solo, brute force
        StringBuilder encryptMsg = new StringBuilder();
    
        for(int i=0; i<s.length(); i++){
            int curLetter = (int) s.charAt(i);

            if(97 <= curLetter && curLetter <= 122){
                curLetter = curLetter + k;
                if(curLetter > 122){
                    while(curLetter > 122)
                        curLetter = curLetter - 26;
                }
            }
            else if(65 <= curLetter && curLetter <= 90){
                curLetter = curLetter + k;
                if(curLetter > 90){
                    while(curLetter > 90)
                        curLetter = curLetter - 26;
                }
            }            
            String encrypVal = String.valueOf((char) curLetter);
            encryptMsg.append(encrypVal);            
        }
        return encryptMsg.toString();
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
