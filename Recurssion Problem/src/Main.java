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
       int firstOccurrence = firstOccurrenceUsingBinarySearch(a, element) ;
       int lastOccurrence = lastOccurrenceUsingBinarySearch(a, element) ;

        System.out.println("First Occurrence: "+ firstOccurrence);
        System.out.println("Last Occurrence: "+lastOccurrence);

        int count = lastOccurrence - firstOccurrence + 1 ;

        System.out.println("Total Count of "+ element + " is: "+count) ;


    }

    public static int firstOccurrenceUsingBinarySearch(int[] a, int element){
        int start = 0 ;
        int end = a.length - 1 ;
        int mid ;
        int result = 0 ;
        while (start <= end){
            mid = start + (end - start) / 2 ;
            if (element == a[mid]){
                result = mid ;
                end = mid - 1 ;
            }else  if (element < a[mid]){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return result ;
    }
    public static int lastOccurrenceUsingBinarySearch(int[] a, int element){
        int start =  0;
        int end = a.length - 1 ;
        int mid ;
        int result = 0;

        while(start <= end){
            mid = start + (end - start) / 2 ;
            if (element == a[mid]){
                result = mid ;
                start = mid + 1 ;
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

First Occurrence: 2
Last Occurrence: 6
Total Count of 10 is: 5

 */