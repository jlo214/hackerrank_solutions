/*
jlo214
05/2020
https://www.hackerrank.com/challenges/cavity-map/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CavityMap {

    static String[] cavityMap(String[] grid) {
        //had to look up algo
        //didn't know how to do the comparison
        int gLength = grid.length;
        
        for(int i=1; i<gLength-1; i++){
            String val = grid[i];    
            
            for(int j=1; j<gLength-1; j++){
                if( val.charAt(j-1)<val.charAt(j) && val.charAt(j+1)<val.charAt(j) 
                        && grid[i-1].charAt(j)<val.charAt(j) && grid[i+1].charAt(j)<val.charAt(j) ){ //check all conditions
                    grid[i] = grid[i].substring(0,j) +"X"+ grid[i].substring(j+1);
                }
            }
        }
        return grid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];
        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) 
                bufferedWriter.write("\n");            
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
