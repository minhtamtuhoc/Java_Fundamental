import java.util.Scanner;

public class SapXepVaTimKiem {

    // 1. Selection Sort giảm dần
    public static void selectionSortDesc(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
    }

    // 2. Linear Search
    public static int linearSearch(int[] a, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 3. Binary Search (CHO MẢNG GIẢM DẦN)
    public static int binarySearchDesc(int[] a, int n, int x) {
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == x) {
                return mid;
            }

            // ⚠️ ĐẢO NGƯỢC LOGIC vì mảng giảm dần
            if (a[mid] < x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // In mảng
    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Sắp xếp giảm dần
        selectionSortDesc(a, n);

        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        printArray(a, n);

        // Tìm kiếm
        System.out.print("Nhập số cần tìm: ");
        int x = sc.nextInt();

        int pos1 = linearSearch(a, n, x);
        int pos2 = binarySearchDesc(a, n, x);

        // Kết quả
        if (pos1 != -1) {
            System.out.println("Linear Search: Tìm thấy tại vị trí " + pos1);
        } else {
            System.out.println("Linear Search: Không tìm thấy");
        }

        if (pos2 != -1) {
            System.out.println("Binary Search: Tìm thấy tại vị trí " + pos2);
        } else {
            System.out.println("Binary Search: Không tìm thấy");
        }
    }
}