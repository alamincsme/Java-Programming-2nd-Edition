package chap07;

import java.util.ArrayList;
import java.util.List;

public class GroceryProduct {
    private final String name;
    private final double price;

    public GroceryProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class Fruit extends GroceryProduct {
    public Fruit(String name, double price) {
        super(name, price);
    }
}



class Meat extends GroceryProduct {

    public Meat(String name, double price) {
        super(name, price);
    }
}


class Vegetable extends GroceryProduct {

    public Vegetable(String name, double price) {
        super(name, price);
    }
}


interface DiscountCalculator {
    public double calculateDiscount (GroceryProduct product);
}

enum MemberShipStatus {
    REGULAR,
    PREMIUM,
    NON_MEMBER
}


class NonMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        System.out.println("Non Member has no discount.");
        return 0.0;
    }
}

class PremiumMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        return product.getPrice() * 0.15 ;
    }
}

class RegularMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        return product.getPrice() * .1 ;
    }
}

class Customer {
    private final String name;
    private final MemberShipStatus memberShipStatus;
    private final DiscountCalculator discountCalculator ;

    public Customer(String name, MemberShipStatus memberShipStatus) {
        this.name = name;
        this.memberShipStatus = memberShipStatus;

        switch (memberShipStatus) {
            case REGULAR -> discountCalculator = new RegularMemberDiscountCalculator();
            case PREMIUM -> discountCalculator = new PremiumMemberDiscountCalculator();
            default -> discountCalculator = new NonMemberDiscountCalculator();
        }

    }

    public  DiscountCalculator getDiscountCalculator () {
        return discountCalculator ;
    }
}

class GroceryStoreShoppingCart {
    private final List<GroceryProduct> products  = new ArrayList<>();
    private final Customer customer;

    public GroceryStoreShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(GroceryProduct product) {
        products.add(product);
    }

    public double checkout () {
        double totalPrice = 0.0;
        for (GroceryProduct product : products) {
            var discount = customer.getDiscountCalculator().calculateDiscount(product) ;
            totalPrice += (product.getPrice() - discount);
        }
        return totalPrice;
    }
}

class GroceryProductStore {
    public static void main(String[] args) {
        var banana = new Fruit("Banana", .5);
        var carrot = new Fruit("Carrot", .25);
        var steak = new Fruit("Steak", 5.00);

        var customer = new Customer("Alamin", MemberShipStatus.PREMIUM);

        GroceryStoreShoppingCart cart = new GroceryStoreShoppingCart(customer);
        cart.addProduct(banana);
        cart.addProduct(carrot);
        cart.addProduct(steak);

        var count = cart.checkout();
        System.out.println("Amount = " + count);
    }
}