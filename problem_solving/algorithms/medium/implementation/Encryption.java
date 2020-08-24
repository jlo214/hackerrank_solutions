/*
jlo214
07/2020
https://www.hackerrank.com/challenges/encryption/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    static String encryption(String s) {
        //solo attempt
        String temp = s.replaceAll(" ","");   
        int len = temp.length();
        
        double ceil = Math.ceil(Math.sqrt(len));
        double floor = Math.floor(Math.sqrt(len));
        int rows = 0;
        int cols = 0;
        
        if((int) ceil * (int) floor >= len) {
            rows = (int) floor;
            cols = (int) ceil;
        }
        else {
            rows = (int) floor + 1;
            cols = (int) ceil;
        }

        char[][] grid = new char[rows][cols];
        int k = 0;
            
        //rows
        for(int i=0; i<grid.length; i++) {
            //cols
            for(int j=0; j<grid[0].length; j++) {
                if(k < len)
                    grid[i][j] = temp.charAt(k++);                              
            }
        }        
        String res = returnMsg(grid);
        return res;
    }

    public static String returnMsg(char[][] grid) {
        StringBuilder res = new StringBuilder();
        //cols
        for(int i=0; i<grid[0].length; i++) {
            //rows
            for(int j=0; j<grid.length; j++) {
                //very annoying bug, that didn't happen on online java compiler
                if(grid[j][i] != '\u0000')
                    res.append(grid[j][i]);                
            }
            res.append(" ");
        }
        return res.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
