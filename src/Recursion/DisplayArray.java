package Recursion;

import java.util.Scanner;

public class DisplayArray {

    public static void solution(int[] arr, int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        solution(arr, i+1);
    }
    public static void reverse_solution(int[] arr, int i){
        if(i==0){
            System.out.println(arr[i]);
            return;
        }
        System.out.println(arr[i]);
        reverse_solution(arr, i-1);
    }
    public static int maxOfArray(int[] arr, int i, int max){
        if(i==arr.length){
            return max;
        }
        max = Math.max(arr[i],max);
        return maxOfArray(arr, i+1, max);

    }
    public static void main(String[] args) throws Exception{
        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        for(int j=0;j<arr.length;j++){
            arr[j]=scn.nextInt();
        }
//        solution(arr,0);
//        reverse_solution(arr,arr.length-1);
        int max = Integer.MIN_VALUE;
        System.out.println(maxOfArray(arr, 0,max));

    }
}
