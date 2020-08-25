/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-list/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //solo attempt
        Scanner in = new Scanner(System.in);
        int numListLen = in.nextInt();
        List<Integer> numList = new ArrayList<>();

        for(int i=0; i<numListLen; i++)
            numList.add(in.nextInt());        
        
        int queryLen = in.nextInt();
        for(int i=0; i<queryLen; i++){
            String operation = in.next();
            if(operation.equalsIgnoreCase("Insert"))
                numList.add(in.nextInt(), in.nextInt()) ;
            else if(operation.equalsIgnoreCase("Delete"))
                numList.remove(in.nextInt());
        }
        in.close();

        for(Integer e: numList)
            System.out.print(e+" ");
    }
}