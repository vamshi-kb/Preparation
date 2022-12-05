package RecursionWayUp;

import java.util.Scanner;

public class StairPaths {
    public static void getStairPaths(int n, String sl){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(sl);
            return;
        }
        getStairPaths(n-1, sl+"1");
        getStairPaths(n-2, sl+"2");
        getStairPaths(n-3, sl+"3");

    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String sl = "";

        getStairPaths(n,sl);
    }
}
