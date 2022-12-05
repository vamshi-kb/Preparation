package Arrays;

import java.io.InputStream;
import java.util.Scanner;

public class StringCompression {
    public static void compression1(String str){
        String ans = " ";
        ans+=str.charAt(0);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=ans.charAt(ans.length()-1)){
                ans+=str.charAt(i);
            }
        }

       System.out.print(ans);

    }


    public static void compression2(String str){
        int count=1;
        String ans = " ";
        ans+=str.charAt(0);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==ans.charAt(ans.length()-1)){
                count++;
            }
            else{
                if(count>1)
                    ans+=count;

                ans+=str.charAt(i);
                count=1;
            }
        }
        if(count>1)
            ans+=count;
        System.out.print(ans);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        compression1(str);
        compression2(str);
    }
}
