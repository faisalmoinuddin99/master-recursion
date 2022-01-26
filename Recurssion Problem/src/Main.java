import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[5];
      a[0] = 5 ;
      a[1] = 10 ;
      a[2] = 30 ;
      a[3] = 20 ;
      a[4] = 40 ;

      int result = findElementInNearlySortedArray(a,40 );
        System.out.println("Searching in nearly sorted Array: "+result);

    }
    public static int findElementInNearlySortedArray(int[] a, int target){
        // modified binary search
        int start = 0 ;
        int end = a.length - 1 ;
        int mid ;
        while (start <= end){
            mid = start + (end - start) / 2 ;

            if(target == a[mid]){
                return mid ;
            }
            if(mid - 1 >= start && a[mid - 1] == target){
                return mid - 1;
            }
            if (mid + 1 <= end && a[mid + 1]== target){
                return mid + 1 ;
            }
            if(target < a[mid]){
                end = mid - 2;
            }else{
                start = mid + 2 ;
            }
        }
        return -1 ;
    }
}
/*
OUTPUT:

Searching in nearly sorted Array: 4

 */