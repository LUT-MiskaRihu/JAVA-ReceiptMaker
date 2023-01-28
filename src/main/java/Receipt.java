import java.util.ArrayList;

public class Receipt {
    ArrayList<Product> products;
    private double discount;

    public Receipt() {
        products = new ArrayList<>();
        discount = 0.00;
    }

    public int getDiscount() {
        return (int) discount * 100;
    }

    public void setDiscount(int discount) {
        this.discount = (double) discount / 100;
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Product p : products) {
            subtotal += p.getSubtotal();
        }
        return subtotal;
    }
    
    public double getTotal() {
        // total = subtotal * (1 - discount percentage in decimal form)
        return getSubtotal() * (1 - discount); 
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
