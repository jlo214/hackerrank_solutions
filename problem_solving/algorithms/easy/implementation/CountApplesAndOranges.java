/*
jlo214
02/2020
https://www.hackerrank.com/challenges/apple-and-orange/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountApplesAndOranges {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int m = apples.length; //# of apples
        int n = oranges.length; //# of oranges        
        int[] appleRes = new int[m];
        int[] orangeRes = new int[n];
        int totalApples = 0;
        int totalOranges = 0;
        
        //Apples
        for(int i=0; i<apples.length; i++){
            appleRes[i] = a + apples[i];
            
            if(appleRes[i] >= s && appleRes[i] <= t)
                totalApples++;            
        }
  
        //Oranges
        for(int j=0; j<oranges.length; j++){
            orangeRes[j] = b + oranges[j];
            
            if(orangeRes[j] >= s && orangeRes[j] <= t)
                totalOranges++;            
        }
                
        System.out.println(totalApples);
        System.out.println(totalOranges);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];
        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];
        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}
