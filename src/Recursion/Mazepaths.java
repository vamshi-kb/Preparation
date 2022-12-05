package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Mazepaths {
    public static ArrayList<String> getMP(int i, int j){
        if(i==1 && j==1){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        if(i<1 || j<1){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }

        ArrayList<String> mr = new ArrayList<>();

        ArrayList<String> rr1 = getMP(i-1,j);
        ArrayList<String> rr2 = getMP(i,j-1);
        for(int k=0;k<rr1.size();k++){
            mr.add("V"+rr1.get(k));
        }

        for(int k=0;k<rr2.size();k++){
            mr.add("H"+rr2.get(k));
        }
        return mr;
    }
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMP(n,m));
    }
}
