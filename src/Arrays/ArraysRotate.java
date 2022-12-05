package Arrays;

import java.util.Scanner;

public class ArraysRotate {
    public static void main(String[] args) throws Exception {
        int n = 4;
        int m = 4;

        int temp = 0;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = temp;
                temp++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i>j) {
                    int arr_temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i] = arr_temp;
                }
            }
        }
        int left = 0;
        int right = arr[0].length-1;
        while(left<right){
            for (int row = 0; row < m; row++) {
                int arr_temp2 = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = arr_temp2;
            }
            left++;
            right--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
