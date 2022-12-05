package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneKeypad {
    public static ArrayList<String> keypadString(String num){
        if(num.length()==0){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char ch = num.charAt(0);
        String roNum = num.substring(1);
        ArrayList<String> rr = keypadString(roNum);
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<String> mr = new ArrayList<>();
        String code = arr[ch - '0'];
//        System.out.println(ch+" "+rr);
        for(int i=0;i<code.length();i++){
            char c = code.charAt(i);
            for(int j=0;j<rr.size();j++){
                mr.add(c+rr.get(j));
            }
        }
        return mr;
    }
    static String[] arr = new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String num = scn.nextLine();
        System.out.println(keypadString(num));
    }
}
