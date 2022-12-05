package Recursion;

public class firstIndex {
    public static int lastIndexSolution(int[] arr,int i, int element){
        if(i==-1){
            return -1;
        }
        if(arr[i]==element)
            return i;
        return  lastIndexSolution(arr,i-1,element);
    }
    public static int firstIndexSolution(int[] arr,int i, int element){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==element)
            return i;
        return  firstIndexSolution(arr,i+1,element);
    }
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{2,6,78,87,23,7,76,23,54,22,1,54,3,1};

        int x=2;
        System.out.println(firstIndexSolution(arr,0, x));
        System.out.println(lastIndexSolution(arr,arr.length-1, x));
    }
}
