/*
jlo214
05/2020
https://www.hackerrank.com/challenges/library-fine/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int dayBase = 15;
        int monthBase = 500;
        int yearBase = 10000;
        int totalFine = 0;
        
        if(y1 > y2)
            totalFine = yearBase;        
        else if(y1 >= y2 && m1 > m2)
            totalFine = monthBase * (Math.abs(m1 - m2));        
        else if(y1 >= y2 && m1 >= m2 && d1 > d2 )
            totalFine = dayBase * (Math.abs(d1-d2));        

        return totalFine; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");
        int d1 = Integer.parseInt(d1M1Y1[0]);
        int m1 = Integer.parseInt(d1M1Y1[1]);
        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");
        int d2 = Integer.parseInt(d2M2Y2[0]);
        int m2 = Integer.parseInt(d2M2Y2[1]);
        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
