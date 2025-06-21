package SearchPackage;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Product[] products = new Product[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        
        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();
        Product resultLinear = LinearSearch.linearSearch(products, searchId);
        System.out.println("\nLinear Search Result: " + (resultLinear != null ? resultLinear : "Product not found."));
        
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        
        Product resultBinary = BinarySearch.binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Product not found."));
    }
}
