package RecursionWayUp;

import java.util.Scanner;

public class Permutations {
    public static void getPermutations(String str, String sl){
        if(str.length()==0){
            System.out.println(sl);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i)+str.substring(i+1);
            getPermutations(ros,sl+ch);
        }

    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        String sl = "";

        getPermutations(n,sl);
    }
}
