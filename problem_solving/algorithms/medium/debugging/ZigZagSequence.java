/*
jlo214
07/2020
https://www.hackerrank.com/challenges/zig-zag-sequence/problem
*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class ZigZagSequence {
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
   }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n)/2; //1)bc arr is 0 based index
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2; //2)bc wrong val was being switched
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; //3) ed+1 to ed-1 or the loop will keep going out of bounds on arr
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}