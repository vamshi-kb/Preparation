package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static ArrayList<String> getSP(int n){
        if(n==0){
                ArrayList<String> bans = new ArrayList<>();
                bans.add("");
                return bans;
            }
        if(n<0){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }




        ArrayList<String> mr = new ArrayList<>();
        if(n-1>=0) {
            ArrayList<String> rr1 = getSP(n - 1);
            for (int i = 0; i < rr1.size(); i++) {
                mr.add("1" + rr1.get(i));
            }
        }

        if(n-2>=0) {
            ArrayList<String> rr2 = getSP(n-2);
            for (int i = 0; i < rr2.size(); i++) {
                mr.add("2" + rr2.get(i));
            }
        }

        if(n-3>=0) {
            ArrayList<String> rr3 = getSP(n-3);
            for (int i = 0; i < rr3.size(); i++) {
                mr.add("3" + rr3.get(i));
            }
        }
        return mr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getSP(n));
    }
}
