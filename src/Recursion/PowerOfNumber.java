package Recursion;

public class PowerOfNumber {

    public static Integer powerofnumber(int num, int pow){
        if(pow == 0) return 1;
        return num*powerofnumber(num, pow-1);
    }
    public static void main(String[] args) throws Exception {
        int a = powerofnumber(3,5);
        int b = powerofnumber(2,12);

        System.out.println(a);
        System.out.println(b);
    }
}
