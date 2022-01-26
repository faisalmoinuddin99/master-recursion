import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[9];
       a[0] = 2 ;
       a[1] = 4;
       a[2] = 10 ;
       a[3] = 10 ;
       a[4] = 10 ;
       a[5] = 10 ;
       a[6] = 10 ;
       a[7] = 18 ;
       a[8] = 20 ;

       int element = 10 ;
       int firstOccurance = firstOccuranceUsingBinarySearch(a, element) ;
        System.out.println("First occurance of element-> " +  element  + " present at index: " +firstOccurance);


    }
    public static int firstOccuranceUsingBinarySearch(int[] a, int element){
        int start =  0;
        int end = a.length - 1 ;
        int mid ;
        int result = 0;

        while(start <= end){
            mid = start + (end - start) / 2 ;
            if (element == a[mid]){
                result = mid ;
                end = mid - 1 ;
            }
            else if (element < a[mid]){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return result ;
    }
}
/*
OUTPUT:

First occurance of element-> 10 present at index: 2

 */