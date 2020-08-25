/*
jlo214
06/2020
https://www.hackerrank.com/challenges/java-anagrams/problem
*/
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int counts[] = new int[26];

        if(a.length() != b.length())
            return false;
        
        a = a.toLowerCase();            
        for(int i=0; i<a.length(); i++){
            int index = (int) a.charAt(i) - 'a';
            counts[index]++;
        }

        b = b.toLowerCase();
        for(int j=0; j<b.length(); j++){
            int index = (int) b.charAt(j) - 'a';
            counts[index]--;
        }

        for(int k: counts){
            if(k>0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}