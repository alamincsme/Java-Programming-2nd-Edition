
//problem description............
/* We buy various products from Mudir's shop and pay the prices.
 Write a Java program that will ask the user for the prices of how many products they want to buy,
 add the prices together, add 15% VAT, and display the total. Then it will ask for the payment.
 If the amount given by the user is more than the total amount,
 it will show how much money will be returned. And if it's less,
 it will show how much more money is needed to pay.*/


package chap04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductCheckout {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double totalPrice = 0 ;
        boolean finished = false;

        while (! finished) {
            System.out.println("Enter product price (or 0 to finish: ");
            double price = scanner.nextDouble();

            if (price == 0) {
                finished = true ;
            } else {
                totalPrice += price;
            }

            double vat   = totalPrice * .15 ;
            double finalPrice = totalPrice + vat ;

            System.out.println("Total Price : " + totalPrice);
            System.out.println("VAT (15%) : "+ vat);
            System.out.println("Final Price : " + finalPrice);
            System.out.println("Enter amount of money paid : " );
            double moneyPaid = scanner.nextDouble();

            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            if (moneyPaid > finalPrice) {
                double returnAmount = moneyPaid - finalPrice ;
                System.out.println("Return Amount : " + decimalFormat.format(returnAmount));
            } else {
                double outstandingAmount = finalPrice - moneyPaid ;
                System.out.println("Outstanding Amount : " + decimalFormat.format(outstandingAmount));
            }

        }
    }
}

/*Enter product price (or 0 to finish: 
500.00
Total Price : 500.0
VAT (15%) : 75.0
Final Price : 575.0
Enter amount of money paid : 
550.00
Outstanding Amount : 25
*/