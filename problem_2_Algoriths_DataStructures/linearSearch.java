package problem_2_Algoriths_DataStructures;

import java.util.List;

public interface linearSearch {

	public static Product linearSearch(List<Product> products, String targetName) {
	    for (Product product : products) {
	        if (product.getProductName().equalsIgnoreCase(targetName)) {
	            return product;
	        }
	    }
	    return null;
	}

}
