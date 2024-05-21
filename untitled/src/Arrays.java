
import static java.lang.Math.abs;

public class Arrays {
    public static void main(String[] args) {
        //array 1
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArr(arr);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;
        printArr(arr);
        System.out.println();

        //array 2
        int arr2[] = new int[8];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i * 3;
        printArr(arr2);
        System.out.println();

        //array 3
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr(arr3);
        for (int i = 0; i < arr2.length; i++)
            if (arr3[i] < 6)
                arr3[i] *= 2;
        printArr(arr3);
        System.out.println();

        //array 4
        int n = 5;
        int arr4[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            arr4[i][i] = 1;
        print2dArr(arr4);

    }

    static boolean checkBalance(int[] arr) {
        int s = 0, sn = 0;
        for (int i : arr) s += i;
        for (int i : arr) {
            if (s == sn) return true;
            else {
                sn += i;
                s -= i;
            }
        }
        return false;
    }

    static void displace(int[] arr, int n) {
        int buf;
        int l = arr.length;
        boolean dir = (n > 0) ? true : false;
        n = abs(n % l);
        for (int i = 0; i < n; i++) {
            if (dir) {
                buf = arr[l - 1];
                for (int j = l - 1; j > 0; j--)
                    arr[j] = arr[j - 1];
                arr[0] = buf;
            } else {
                buf = arr[0];
                for (int j = 0; j < l - 1; j++)
                    arr[j] = arr[j + 1];
                arr[l - 1] = buf;
            }
        }
        return;
    }

    static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    static void print2dArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("\n");
    }
}
