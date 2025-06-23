package problem_2_Algoriths_DataStructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface binarySearch {

	public static Product binarySearch(List<Product> products, String targetName) {
	    int low = 0;
	    int high = products.size() - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2;
	        Product midProduct = products.get(mid);
	        int cmp = midProduct.getProductName().compareToIgnoreCase(targetName);

	        if (cmp == 0) {
	            return midProduct;
	        } else if (cmp < 0) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }

	    return null;
	}
}
