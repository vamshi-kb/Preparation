package RecursionWayUp;

import java.util.Scanner;

public class MazeWithJumps {
    public static void getMazeJumpPaths(int sr, int sc, int dr, int dc, String sl){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(sl);
            return;
        }

        for(int jumps=1;jumps<=dr-sr;jumps++){
            getMazeJumpPaths(sr+jumps,sc,dr, dc,sl+"v"+jumps);
        }
        for(int jumps=1;jumps<=dc-sc;jumps++){
            getMazeJumpPaths(sr,sc+jumps,dr, dc,sl+"h"+jumps);
        }
        for(int jumps=1;jumps<=dc-sc&&jumps<=dr-sr;jumps++){
            getMazeJumpPaths(sr+jumps,sc+jumps,dr, dc,sl+"d"+jumps);
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int sr = 0;
        int sc = 0;
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        String sl = "";

        getMazeJumpPaths(sr,sc,dr-1,dc-1,sl);
    }
}
