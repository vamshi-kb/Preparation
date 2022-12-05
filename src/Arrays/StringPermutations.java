package Arrays;

import java.util.Scanner;

public class StringPermutations {
    public static void palindromeSubstrings(String str){
        int n = str.length();
        int nf=1;

        for(int i=1;i<=n;i++){
            nf*=i;
        }

        for(int i=0;i<nf;i++) {
            StringBuilder sb = new StringBuilder(str);
            for (int div = n, dvd =i;div>0;div--){
                int r = dvd%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                dvd = dvd/div;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        palindromeSubstrings(str);
    }
}
