import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;

        int result = binarySearch(a, 10) ;
        if (result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element present at index: " + result );

        }
    }
    public static int binarySearch(int[] a, int element){
        int start = 0 ;
        int end = a.length - 1 ;
        int mid ;
        while(start <= end){
            mid = start + (end - start ) / 2 ;
            if (element == a[mid]){
                return mid ;
            }
           else if (element < a[mid]){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return  -1 ;
    }
}
/*
OUTPUT:

Element present at index: 9

 */