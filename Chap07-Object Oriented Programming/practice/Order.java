import java.util.ArrayList;
import java.util.List;

public class Order {
    private int oderId;
    private String customer;
    private List<Product> products ;

    public Order (int oderId, String customer) {
        this.oderId = oderId;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product ) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getPrice() {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice() * product.getQuantity() ;
        }

        return (int) price;
    }

    public int getOderId() {
        return oderId;
    }
    public String getCustomer() {
        return customer;
    }

    public static void main(String[] args) {
        Order order = new Order(100, "Mohammad Alamin");
        Product hpLaptop = new Product("hp laptop", 64000, 2);
        Product keyboard = new Product("Logitech ", 750, 20);

        order.addProduct(hpLaptop);
        order.addProduct(keyboard);

        int price = order.getPrice();
        System.out.println(price);
    }
}
