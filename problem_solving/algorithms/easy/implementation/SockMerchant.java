/*
jlo214
04/2020
https://www.hackerrank.com/challenges/sock-merchant/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
	//looked up sample algo, but made my own
    static int sockMerchant(int n, int[] ar) {
	
        int pairs = 0;
        List<Integer> sockComparison = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++) {
            int currentSock = ar[i];
            
            if(sockComparison.contains(currentSock)) {
                sockComparison.remove(new Integer(currentSock));
                pairs++;
            }
            else
                sockComparison.add(currentSock);                       
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
