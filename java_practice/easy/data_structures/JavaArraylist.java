/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-arraylist/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int listLen = in.nextInt();
        List <List<Integer>> numList = new ArrayList<List<Integer>>();

        for(int j=0; j<listLen; j++)
            numList.add(new ArrayList<Integer>());
        
        for(int i=0; i<numList.size(); i++){
            int cols = in.nextInt();
            for(int k=0; k<cols; k++){
                numList.get(i).add(in.nextInt());
            }
        }

        int qLen = in.nextInt();
        for(int i=0; i<qLen; i++){
            int row = in.nextInt()-1;
            int col = in.nextInt()-1;
            try{
                System.out.println( numList.get(row).get(col) );
            }
            catch(Exception e){
                System.out.println( "ERROR!" );
            }                          
        }
        in.close(); 
    }
}