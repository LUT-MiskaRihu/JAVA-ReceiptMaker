public class Product {
    private String name;
    private double price;
    private int count;
    private double discount;

    public Product() {
        name = null;
        price = 0.00;
        count = 1;
        discount = 0.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSubtotal() {
        // subtotal = number of items * price per one * (1 - discount percentage in decimal form)
        return count * price * (1 - discount);
    }
}
