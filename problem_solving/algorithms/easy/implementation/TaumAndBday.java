/*
jlo214
05/2020
https://www.hackerrank.com/challenges/taum-and-bday/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
    //solo attempt, brute force
        long tempB = Long.valueOf(b); 
        long tempW = Long.valueOf(w); 
        long tempBC = Long.valueOf(bc); 
        long tempWC = Long.valueOf(wc); 
        long tempZ = Long.valueOf(z); 
        long minCost = 0l;
       
        if(tempBC == tempWC)
            minCost = (tempW * tempWC)+(tempB * tempBC);        
        
        else if(((tempBC+tempZ)*tempW) <= (tempWC*tempW))
            minCost = ((tempBC + tempZ) * tempW) + (tempBC * tempB);        
        
        else if( ((tempWC+tempZ)*tempB) <= (tempBC*tempB) )    
            minCost = ((tempWC + tempZ) * tempB) + (tempWC * tempW);        
        
        else
            minCost = (tempW * tempWC) + (tempB * tempBC);
        
        return minCost;
    }

}

public class TaumAndBday {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int b = Integer.parseInt(firstMultipleInput[0]);
            int w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int bc = Integer.parseInt(secondMultipleInput[0]);
            int wc = Integer.parseInt(secondMultipleInput[1]);
            int z = Integer.parseInt(secondMultipleInput[2]);

            long result = Result.taumBday(b, w, bc, wc, z);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
