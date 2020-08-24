/*
jlo214
04/2020
https://www.hackerrank.com/challenges/reduced-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperReducedString {

    static String superReducedString(String s) {
        //looked up algo, but studied it
        char[] sArr = s.toCharArray();
        Stack<Character> stk = new Stack<Character>();
        String result = "";
        
        for(int i=0; i<sArr.length; i++){
            if(stk.empty())
                stk.push(sArr[i]);            
            else if(sArr[i] == stk.peek())
                stk.pop();            
            else
                stk.push(sArr[i]);            
        }
        
        while(!stk.empty()) {
            result = stk.pop() + result;
        }

        if(result.equals("")){
            result = "Empty String";
            return result;
        }
        else
            return result;        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();
        String result = superReducedString(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}