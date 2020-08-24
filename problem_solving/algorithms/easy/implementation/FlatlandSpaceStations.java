/*
jlo214
05/2020
https://www.hackerrank.com/challenges/flatland-space-stations/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int[] c) {
        //solo v3 optimized further, removed cities arr and minDistance arr
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = 0;
        
        if(c.length == n)
            return maxDistance;        

        for(int j=0 ; j<n; j++){
            for(int k=0; k<c.length; k++){
                if( Math.abs( j - c[k] ) < minDistance )
                    minDistance = Math.abs(j - c[k]);                
            }
                if(minDistance > maxDistance)
                    maxDistance = minDistance;
                
                minDistance = Integer.MAX_VALUE;
        }
        return maxDistance;
    }
    
    /*
    static int flatlandSpaceStations(int n, int[] c) {
        //solo v2, passed
        int minDistance = Integer.MAX_VALUE;
        int[] minDisAr = new int[n];
        int maxDistance = 0;

        for(int j=0 ; j<n; j++){
            for(int k=0; k<c.length; k++){
                if( Math.abs( j - c[k] ) < minDistance )
                    minDistance = Math.abs(j - c[k]);                
            }
            minDisAr[j] = minDistance;
            minDistance = Integer.MAX_VALUE;
        }
        
        for(int z=0; z<minDisAr.length; z++ ){
            if(minDisAr[z] > maxDistance)
                maxDistance = minDisAr[z];            
        }
        return maxDistance;
    }

        static int flatlandSpaceStations(int n, int[] c) {
        //solo v1, timed out
        int cities[] = new int[n];
        int minDistance = Integer.MAX_VALUE;
        int[] minDisAr = new int[n];
        int maxDistance = 0;
        
        for(int i=0; i<cities.length; i++)
            cities[i] = i;        
        
        for(int j=0 ; j<cities.length; j++){
            for(int k=0; k<c.length; k++){
                if( Math.abs( cities[j] - c[k] ) < minDistance )
                    minDistance = Math.abs(cities[j] - c[k]);                
            }
            minDisAr[j] = minDistance;
            minDistance = Integer.MAX_VALUE;
        }
        
        for(int z=0; z<minDisAr.length; z++ ){
            if(minDisAr[z] > maxDistance)
                maxDistance = minDisAr[z];            
        }
        return maxDistance;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
