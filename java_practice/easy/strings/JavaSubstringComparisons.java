/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-string-compare/problem
*/
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'       
        //looked at discussions and found compareTo method 
        String[] subStr = new String[s.length() - k + 1];                
        for(int i=0; i<=s.length()-k; i++){
            String tmp = s.substring(i,i+k);
            subStr[i] = tmp;
        }
        
        String smallest = subStr[0];
        String largest = subStr[0];
        for(int i=0; i<subStr.length; i++){
            if( subStr[i].compareTo(smallest) < 0 )
                smallest = subStr[i];
            else if( subStr[i].compareTo(largest) > 0 )
                largest = subStr[i];
        }        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}