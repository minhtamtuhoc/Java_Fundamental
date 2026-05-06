import java.util.Scanner;

public class SapXepChanLe {

    public static void stableEvenOdd(int[] a, int n) {
        int[] result = new int[n];
        int index = 0;

        // B1: thêm số chẵn
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                result[index++] = a[i];
            }
        }

        // B2: thêm số lẻ
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                result[index++] = a[i];
            }
        }

        // copy lại vào mảng gốc
        for (int i = 0; i < n; i++) {
            a[i] = result[i];
        }
    }

    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        stableEvenOdd(a, n);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(a, n);
    }
}