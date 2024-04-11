import java.util.*;

class CollectionClass {
    public static void main(String[] args)
    {

        int n = 5;


        ArrayList<String> arr1 = new ArrayList<String>(n);


        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
        arr1.add("Hello");
        arr1.add("To");
        arr1.add("Everyone");
        
        for (int i = 1; i <= n; i++) {
            arr2.add(i);
        }

        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
    }
}