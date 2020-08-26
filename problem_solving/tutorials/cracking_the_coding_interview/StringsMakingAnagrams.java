/*
jlo214
8-24-2020
https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

ex: a= "cde" b= "abc"
1) iterate through string a and add all chars to hashmap 
	map: {c=1, d=1, e=1}

2) iterate through string b and subtract all chars from hashmap	
	now all chars and counts left in the hashmap are deletions
	map: {a=-1, b=-1, c=0, d=1, e=1}

3) iterate through hashmap and add all absolute values to get the number of deletions 
	some vals are negative if b has vals that a doesn't have. which is why we have to do Math.abs
	to get accurate count of deletions
	1+1+1+1= 4 deletions
	cde - d & e = c 
	abc - a & b = c
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringsMakingAnagrams {

    static int makeAnagram(String a, String b) {

        HashMap<Character, Integer> map = new HashMap<>();
        Integer delete = 0;
        
        for(int i=0; i<a.length(); i++){
            Integer count = map.containsKey(a.charAt(i)) ? map.get(a.charAt(i)) : 0;
            map.put(a.charAt(i), count+1); 
        }
        for(int j=0; j<b.length(); j++){
            Integer count = map.containsKey(b.charAt(j)) ? map.get(b.charAt(j)) : 0;
            map.put(b.charAt(j), count-1);
        }
                
        for(Integer i : map.values())
            delete += Math.abs(i);
        
        return delete;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
