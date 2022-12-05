package Arrays;

public class ArrayWakanda {
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

        for (int diag = 0; diag < m; diag++){
            for(int i=0, j=diag;j<m;i++,j++){
                    System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
