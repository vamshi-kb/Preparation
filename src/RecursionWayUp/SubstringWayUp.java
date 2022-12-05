package RecursionWayUp;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class SubstringWayUp {
    public static void getSubStrings(String str, String sfr){
        if(str.equals("")){
            System.out.println(sfr);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        getSubStrings(ros,sfr+ch);
        getSubStrings(ros,sfr);

    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        String sfr = "";

        getSubStrings(n,sfr);
    }
}
