/*
jlo214
04/2020
https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankInString {

    static String hackerrankInString(String s) {
    //solo
        String word = "hackerrank";
        char[] wordArr = new char[word.length()];
        char[] sArr = new char[s.length()];
        boolean equal = Arrays.equals(sArr, wordArr);
        
        for(int i=0; i<wordArr.length; i++){
            wordArr[i] = word.charAt(i);
        }
        for(int j=0; j<s.length(); j++){
            sArr[j] = s.charAt(j);
        }

        int index = 0;
        int count = 0;

        for(int z=0; z<wordArr.length; z++){
            while(index != sArr.length){
                if(wordArr[z] == sArr[index]){
                    count++;
                    index++;
                    break;
                }
                index++;    
            }
        }

        if(count == 10)
            return "YES";        

        return "NO";        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}