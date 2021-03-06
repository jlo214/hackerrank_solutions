/*
jlo214
07/2020
https://www.hackerrank.com/challenges/lonely-integer/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LonelyInteger {

    static int lonelyinteger(int[] a){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<a.length; i++){
            if(map.get(a[i]) == null)
                map.put(a[i], map.get(a[i]) == null ? 1: map.get(a[i])+1 );            
            else if(map.get(a[i]) != null)
                //remove entry from map
                map.remove(a[i]);            
        }

        String res = map.keySet().toString();
        int fRes = Integer.valueOf(res.substring(1,res.length()-1));
        
        return fRes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}