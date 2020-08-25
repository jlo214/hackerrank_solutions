/*
jlo214
07/2020
https://www.hackerrank.com/challenges/java-singleton/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    
    //1) private singleton non param constructor
    private Singleton(){ }
    
    //2)a public string instance variable named str
    public String str = "";
    
    //3)static method named getSingleInstance that returns the single instance of singleton class
    public static Singleton getSingleInstance(){
        return new Singleton();
    }
}