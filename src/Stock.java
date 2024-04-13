public class Stock {
    private final Product[] products;
    private int qty;
    private final int capacity;

    public Stock(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        this.capacity = capacity;
        products = new Product[capacity];
        qty = 0;
    }

    public void addProduct(Product p) {
        if (qty < capacity) {
            boolean idExists = false;
            for (int i = 0; i < qty; i++) {
                if (products[i].id == p.id) {
                    idExists = true;
                    break;
                }
            }
            if (!idExists) {
                products[qty] = p;
                qty++;
                System.out.println("Product successfully added to the stock.");
            } else {
                System.out.println("Product ID already exists in the stock. Unable to add.");
            }
        } else {
            System.out.println("Stock is full. Unable to add more products.");
        }
    }

    public void removeProduct(int id) {
        boolean found = false;
        for (int i = 0; i < qty; i++) {
            if (products[i].id == id) {
                found = true;
                for (int j = i; j < qty - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[qty - 1] = null;
                qty--;
                System.out.println("Product removed from the stock.");
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in the stock.");
        }
    }

    public void updateStock(int id, int newQty) {
        boolean found = false;
        for (int i = 0; i < qty; i++) {
            if (products[i].id == id) {
                found = true;
                products[i].qty = newQty;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in the stock.");
        }
    }

    public Product[] getProducts() {
        return products;
    }

    public int getQty() {
        return qty;
    }

    public int getCapacity() {
        return capacity;
    }
}
