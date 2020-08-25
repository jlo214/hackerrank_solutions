/*
jlo214
05/2020
https://www.hackerrank.com/challenges/java-end-of-file/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //had to brush up on how to read a file

        //File file = new File("???");
        Scanner sc = new Scanner(System.in);

        StringBuilder res = new StringBuilder();
        int lineNum = 1;
        while(sc.hasNext()){
            res.append(lineNum+" "+sc.nextLine()+"\n");
            lineNum++;
        }
        System.out.println(res);
    }
}