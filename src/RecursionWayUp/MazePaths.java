package RecursionWayUp;

import java.util.Scanner;

public class MazePaths {
    public static void getMazePaths(int sr, int sc, int dr, int dc, String sl){
        if(sr==dr && sc==dc){
            System.out.println(sl);
            return;
        }
        if(sr>dr || sc>dc){
            return;
        }
        getMazePaths(sr+1,sc,dr, dc,sl+"h");
        getMazePaths(sr,sc+1,dr, dc, sl+"v");

    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int sr = 0;
        int sc = 0;
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        String sl = "";

        getMazePaths(sr,sc,dr-1,dc-1,sl);
    }
}
