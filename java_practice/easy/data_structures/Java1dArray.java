/*
jlo214
05/2020
https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
*/
import java.util.*;

public class Java1dArray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int val = scan.nextInt();

        int[] a = new int [n];
        for(int i=0; i<a.length; i++){
            a[i] = scan.nextInt();;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}