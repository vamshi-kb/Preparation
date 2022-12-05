package RecursionWayUp;

import java.util.Scanner;

public class PrintKeypad {
    public static void getKeypad(String str, String sfr){
        if(str.equals("")){
            System.out.println(sfr);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        String code = arr[ch-'0'];
        for(int i=0;i<code.length();i++){
            getKeypad(ros,sfr+code.charAt(i));
        }
    }
    static String[] arr = new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        String sfr = "";

        getKeypad(n,sfr);
    }
}
