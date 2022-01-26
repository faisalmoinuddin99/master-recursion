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

       int result = findNoOfTimesArrayIsRotated(a);
       System.out.println("Number of times a sorted array is rotated: " + result);
       findElementInSortedRotatedArray(a,18);

    }
    public static void findElementInSortedRotatedArray(int[] a, int element){
        int index = findNoOfTimesArrayIsRotated(a) ;
        int firstHalf = binarySearch(a,0,index - 1, element) ;
        int secondHalf = binarySearch(a,index + 1,a.length - 1 , element) ;
        System.out.println("first half " + firstHalf);
        System.out.println("second half " + secondHalf);
    }

    public static int binarySearch(int[] a, int start , int end, int element){
        int mid ;
        while(start <= end){

            mid = start + (end - start) / 2;

            if (element == a[mid]){
                return mid ;
            }else if(element < a[mid]){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
    public static int findNoOfTimesArrayIsRotated(int[] a){
        int start = 0 ;
        int end = a.length - 1 ;
        int mid, next, prev;
        int N = a.length ;
        while (start <= end){
            mid = start + (end - start) / 2 ;
            next = (mid + 1) % N ;
            prev = (mid + N -1) % N ;

            if (a[mid] <= a[next] && a[mid] <= a[prev]) {
                return mid ;
            }
            if (a[start] < a[mid]){
                start = mid + 1 ;
            }else if(a[mid] < a[end]){
                end = mid - 1 ;
            }
        }
        return  -1 ;
    }
}
/*
OUTPUT:

Number of times a sorted array is rotated: 4
first half 2
second half -1

 */