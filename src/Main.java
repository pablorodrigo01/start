import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.print("Enter the capacity of the stock: ");
        int capacity = scanner.nextInt();
        Stock stock = new Stock(capacity);

        while (option != 5) {
            System.out.println("1 - Add\n2 - Remove\n3 - Update\n4 - List\n5 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (stock.getQty() < stock.getCapacity()) {
                        System.out.print("Product name: ");
                        String name = scanner.next();
                        System.out.print("Product ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Product quantity: ");
                        int qty = scanner.nextInt();
                        System.out.print("Product price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Product newProduct = new Product(name, id, qty, price);
                        stock.addProduct(newProduct);
                    } else {
                        System.out.println("Stock is full. Cannot add more products.");
                    }
                    break;
                case 2:
                    System.out.println("List of products:");
                    for (Product product : stock.getProducts()) {
                        if (product != null) {
                            System.out.println("ID: " + product.id + ", Quantity: " + product.qty + ", Name: " + product.name);
                        }
                    }
                    System.out.print("Enter the ID of the product to be removed: ");
                    int removeId = scanner.nextInt();
                    stock.removeProduct(removeId);
                    break;
                case 3:
                    System.out.println("List of products:");
                    for (Product product : stock.getProducts()) {
                        if (product != null) {
                            System.out.println("ID: " + product.id + ", Quantity: " + product.qty + ", Name: " + product.name);
                        }
                    }
                    System.out.print("Enter the ID of the product to be updated: ");
                    int updateId;
                    if (scanner.hasNextInt()) {
                        updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the new quantity: ");
                        int newQty = scanner.nextInt();
                        scanner.nextLine();
                        stock.updateStock(updateId, newQty);
                    } else {
                        System.out.println("Product ID must be an integer.");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("List of products:");
                    for (Product product : stock.getProducts()) {
                        if (product != null) {
                            System.out.println("ID: " + product.id + ", Quantity: " + product.qty + ", Name: " + product.name);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
