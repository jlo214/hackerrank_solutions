/*
jlo214
07/2020
https://www.hackerrank.com/challenges/java-md5/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;


public class JavaMd5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String msg = "";
        msg = in.nextLine();

        hash(msg);
    }

    public static void hash(String s) {
        try{
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
            
            /*This is using Base64, should be using hex to convert bytes to String*/
            //String encoded = Base64.getEncoder().encodeToString(hash);
            //System.out.println(encoded);        
            
            for (byte b : hash) 
               System.out.printf("%02x", b);            
        }   
        catch(Exception e){
            e.printStackTrace();
        }
    }
}