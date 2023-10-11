package chap07;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static int ID_GENERATOR = 0 ;
    private int invoiceId = ++ID_GENERATOR;

    private String customer;
    List<Product> items = new ArrayList<>();
    private int totalAmount;

    public Invoice (String customer) {
        this.customer = customer;
    }

    public void addItem(Product product) {
        this.items.add(product);
        this.totalAmount = (int) (product.getPrice() * product.getQuantity());
    }

    public static int getIdGenerator() {
        return ID_GENERATOR;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getItems() {
        return items;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
class ShoppingCart {
    private List<Invoice> invoices = new ArrayList<>();
    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void checkOut() {
        int amountOwed = 0 ;

        for (Invoice invoice : invoices) {
            amountOwed += invoice.getTotalAmount() ;
        }
        System.out.println("total amount owed : " + amountOwed);
    }
}
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
