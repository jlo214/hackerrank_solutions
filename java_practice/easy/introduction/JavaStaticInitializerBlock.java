/*
jlo214
04/2020
https://www.hackerrank.com/challenges/java-static-initializer-block/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

	static Scanner input = new Scanner(System.in);
	static int B = input.nextInt();
	static int H = input.nextInt();
	static Boolean flag = B > 0 && H > 0;
    static{
        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}	
	}
}