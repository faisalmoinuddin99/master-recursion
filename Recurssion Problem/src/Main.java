import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>() ;
        myArray.add(3) ;
        myArray.add(3) ;
        myArray.add(4 );

        twoSum(myArray,6);

    }
    public static void twoSum(List<Integer> a, int target){
        for(int i = 0; i<a.size(); i++){
           for(int j = i + 1; j<a.size();j++){
               if (a.get(i) + a.get(j) == target){
                   System.out.printf("%d %d%n", i, j);
               }
           }
        }
    }
}