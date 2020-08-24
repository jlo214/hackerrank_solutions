/*
jlo214
08/12/2020
https://www.hackerrank.com/challenges/flipping-bits/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlippingBits {

    static long flippingBits(long n) {
        //solo, looked up conversion from long to binary and vice versa

        String num = Long.toBinaryString(n);
        long nLen = Long.toBinaryString(n).length();
        StringBuilder res = new StringBuilder("");        
        long leadingZeros = 32 - nLen;

        if(leadingZeros >=1 && leadingZeros <=32){
            for(int i=1; i<=leadingZeros; i++)
                res.append("1");    
        }
        
        for(int j=0; j<nLen; j++){
            if(num.charAt(j) == '1')
                res.append("0");
            else
                res.append("1");
        }

        long fRes = Long.parseLong(res.toString(),2);
        return fRes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}