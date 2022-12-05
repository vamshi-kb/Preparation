package Recursion;

import java.util.ArrayList;

public class SubstringsArrayLists {

    public static ArrayList<String> arrayListSubstrings(String str){
        if(str.equals("")==true) {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> al = arrayListSubstrings(ros);
        ArrayList<String> mr = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            mr.add(al.get(i));
        }

        for(int i=0;i<al.size();i++){
            mr.add(c+al.get(i));
        }
        return mr;
    }
    public static void main(String[] args) throws Exception{
        String str = "abc";

        System.out.println(arrayListSubstrings(str));
    }
}
