/*
jlo214
04/2020
https://www.hackerrank.com/challenges/strange-advertising/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ViralAdvertising {
    //solo
    static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 0;
        int totalLiked = 0;
        
        for(int j=1; j<=n; j++){
            if(j!=1)
                shared = (shared/2) * 3;    
            
            liked = shared/2;
            totalLiked += liked;
        }
        return totalLiked;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
