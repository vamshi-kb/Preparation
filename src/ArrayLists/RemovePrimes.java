package ArrayLists;

import java.util.ArrayList;

public class RemovePrimes {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        solution(al);
        System.out.println(al);
    }

    public static void solution(ArrayList<Integer> al) {
        for (int i = 0; i < al.size(); i++) {
            if (isPrime(al.get(i)) == true && al.get(i)!=1) {
                al.remove(i);
                i--;
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0)
                return false;
        }
        return true;
    }

}
