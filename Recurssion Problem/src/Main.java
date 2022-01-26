import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[10];
        a[0] = 20;
        a[1] = 19;
        a[2] = 17;
        a[3] = 15;
        a[4] = 14;
        a[5] = 12;
        a[6] = 10;
        a[7] = 9;
        a[8] = 8;
        a[9] = 4;

        int result = binarySearchOnReversedSortedArray(a,14) ;
        System.out.println(result);

    }
    public static int binarySearchOnReversedSortedArray(int[] a, int element){
        int start = 0 ;
        int end = a.length - 1 ;
        int mid ;
        while(start <= end){
            mid = start + (end - start) / 2 ;
            if (element == a[mid]){
                return mid ;
            }
            if (element < a[mid]){
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return  -1 ;
    }
}
/*
OUTPUT:

Element present at index: 4

 */