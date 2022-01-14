import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Integer> arr = new ArrayList<>() ;
    arr.add(0) ;
    arr.add(1) ;
    arr.add(5) ;
    arr.add(2) ;

    int mid = (arr.size()  / 2 )+ 1 ;
        System.out.println(mid);
    for (int i : arr){
        System.out.print(i + " ");
    }
        System.out.println();
    sort(arr);
    for (int i : arr){
        System.out.print(i + " ");
    }

    }

 public static void sort(List<Integer> arr){
        // check array is empty or not
     if(arr.size() == 0){
         return ;
     }
     // base condition
     if(arr.size() == 1){
         return;
     }
     int temp = arr.get(arr.size() - 1);
     arr.remove(arr.size() -1) ;
     sort(arr);
     insert(arr, temp) ;

 }
 public static void insert(List<Integer> arr, int temp){
        if(arr.size() == 0 || arr.get(arr.size() - 1) <= temp){
            arr.add(temp) ;
            return;
        }
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1) ;
        insert(arr,temp);
        arr.add(val) ;
        return;
 }
    
}

/*
OUTPUT:
0 1 5 2
0 1 2 5
 */