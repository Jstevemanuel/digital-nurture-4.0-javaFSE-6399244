package problem_2_Algoriths_DataStructures;

import java.util.*;

public class Main implements binarySearch, linearSearch {
//	
//    Big O notation describes the upper bound of an algorithm's running time as a function of input size (n). 
//    It helps evaluate how the performance of an algorithm scales. 
//    It ignores constant factors and lower-order terms to focus on the dominant behavior as input size grows.
//
//        O(1) – Constant time (e.g., accessing an array element by index)
//        O(n) – Linear time (e.g., linear search)
//        O(log n) – Logarithmic time (e.g., binary search)
//        O(n log n) – Log-linear time (e.g., efficient sorting)
//        O(n²) – Quadratic time (e.g., bubble sort)
	
    public static void main(String[] args) {
    	
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Shoes", "Footwear"));
        products.add(new Product(3, "Phone", "Electronics"));

     
        long start = System.nanoTime();
        Product result1 = linearSearch.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + result1);
        long end = System.nanoTime();
        System.out.println("Time for linear search:"+ (end-start));

        products.sort(Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        // Binary Search
        start = System.nanoTime();  //Start time
        
        Product result2 = binarySearch.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + result2);
        
        end = System.nanoTime(); //End time
        System.out.println("Time for binary search:"+ (end-start));

    }

}
