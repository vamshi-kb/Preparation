package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths2 {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int dr= scn.nextInt();
        int dc = scn.nextInt();
        int sr=0;
        int sc=0;
        System.out.println(getMazePaths(sr,sc,dr-1,dc-1));
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sc>dc || sr>dr){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }
        if(sc==dc && sr==dr){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        ArrayList<String> mr = new ArrayList<>();

        for(int jump=1;jump<=dc-sc;jump++){
            ArrayList<String> rr_c = getMazePaths(sr,sc+jump,dr,dc);
            for(int i=0;i<rr_c.size();i++){
                mr.add("h"+jump+rr_c.get(i));
            }
        }
        for(int jump=1;jump<=dr-sr;jump++){
            ArrayList<String> rr_v = getMazePaths(sr+jump,sc,dr,dc);
            for(int i=0;i<rr_v.size();i++){
                mr.add("v"+jump+rr_v.get(i));
            }
        }
        for(int jump=1;jump<=dr-sr;jump++){
            ArrayList<String> rr_d = getMazePaths(sr+jump,sc+jump,dr,dc);
            for(int i=0;i<rr_d.size();i++){
                mr.add("d"+jump+rr_d.get(i));
            }
        }

        return mr;
    }
}
