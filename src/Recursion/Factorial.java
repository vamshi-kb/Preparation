package Recursion;

import java.util.Scanner;

public class Factorial {
    public static Integer factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) throws Exception{
        int a = factorial(5);
        int b = factorial(6);

        System.out.println(a);
        System.out.println(b);
    }


}
