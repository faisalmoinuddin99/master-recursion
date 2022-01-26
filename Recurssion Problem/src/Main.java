import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[9];
        a[0] = 11;
        a[1] = 12;
        a[2] = 15;
        a[3] = 18;
        a[4] = 2;
        a[5] = 5;
        a[6] = 6;
        a[7] = 8;

        int result = findNoOfTimesArrayIsRotated(a) ;
        System.out.println("Number of times a sorted array is rotated: "+result);

    }

    public static int findNoOfTimesArrayIsRotated(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int mid;
        int prev, next;
        int N = a.length;

        while (start <= end) {
            mid = start + (end - start) / 2;
            prev = (mid + N - 1) % N;
            next = (mid + 1) % N;

            if (a[mid] <= a[next] && a[mid] <= a[prev]) {
                return mid;
            }
            if (a[start] < a[mid]) {
                start = mid + 1;
            } else if (a[mid] < a[end]) {
                end = end - 1;
            }
        }
        return -1;
    }
}
/*
OUTPUT:

Number of times a sorted array is rotated: 4

 */