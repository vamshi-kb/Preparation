package Recursion;

import java.util.Scanner;

public class RecursionIntro {
    public static void printNandback(int n){
        if(n==0) return;
//        n1++;
        System.out.println(n);
        printNandback(n-1);
        System.out.println(n);
//        if(n==1) {
//            int i = 1;
//            while (i <= n1) {
//                System.out.println(i);
//                i++;
//            }
//        }

    }
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
//        int n1=0;
        int n = scn.nextInt();
        printNandback(n);
    }
}
