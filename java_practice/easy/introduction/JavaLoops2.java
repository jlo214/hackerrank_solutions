/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-loops/problem
*/
import java.util.*;
import java.io.*;
import java.lang.Math;

class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double square = 0;
            double result = 0;
            
            for(int j=0; j<n; j++){
                square = Math.pow(2,j);
                if(j==0)
                    result = a+square*b;                    
                else
                    result += square*b;

                System.out.printf("%.0f ", result);
            }
            System.out.printf("%n");
        }
        in.close();      
    }
}