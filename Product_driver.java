import java.util.Arrays;
import java.util.Scanner;

public class Product_driver {
    public static void main(String[] a) {
        Amazon az = new Amazon();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. Add Product\n2. Remove Product\n3. Check Status of the Cart\n4. Exit");
            System.out.println("---------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    az.c.add_product(new Product());
                    break;
                case 2:
                    System.out.print("Enter the position of the product: ");
                    int i = sc.nextInt();
                    az.c.remove_product(i);
                    break;
                case 3:
                    az.c.is_cart_empty();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter the correct number to get output");
            }
        }
    }
}

class Product {
    String p_name;
    int p_id;
    double price;
}

class Cart {
    Product[] p = new Product[5]; // Initialize with a fixed size (e.g., 5)
    int i = 0;

    public void add_product(Product product) {
        if (i < p.length) {
            p[i] = product;
            i++;
            System.out.println("The product is added.");
        } else {
            System.out.println("Cart is full.");
        }
    }

    public void remove_product(int position) {
        if (i > 0 && position >= 1 && position <= i) {
            p[position - 1] = null;
            System.out.println("The product is removed successfully.");
            System.out.println(Arrays.toString(p));
        } else {
            System.out.println("Invalid position or cart is empty.");
        }
    }

    public void is_cart_empty() {
        if (i == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("The cart is not empty.");
        }
    }
}

class Amazon {
    Cart c = new Cart();
}
