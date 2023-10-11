
//problem description..............
/*ধরা যাক,একটি মোবাইল ফোন কোম্পানি পোস্টপেইড সংযোগের জন্য প্রতি মাসে 125 টাকা করে নেয়। বিনিময়ে, প্রথম 500 মিনিট কলের জন্য কোনো চার্জ কাটা হয় না।
        তবে,501 থেকে 1000 মিনিট পর্যন্ত প্রতি মিনিটে 25 পয়সা এবং 1001 মিনিটের পরে এটি প্রতি মিনিটে 49 পয়সা চার্জ করে। একটি জাভা প্রোগ্রাম লিখুন,
        যা কোনো গ্রাহকের মোট কলের পরিমাণ মিনিটে ইনপুট হিসেবে গ্রহণ করবে এবং গ্রাহককে প্রতি মাসে কত বিল পরিশোধ করতে হবে তা প্রিন্ট করবে|

        Let's consider a mobile phone company that charges 125 taka per month for postpaid connections.
        Additionally, for the first 500 minutes of calls, there is no charge. However, from 501 to 1000 minutes,
        there is a charge of 25 paisa per minute, and after 1001 minutes, it charges 49 paisa per minute. Write a Java program
        that takes the total minutes of calls as input from a customer and prints how much the customer needs to pay per month.*/

package chap03;

import java.util.Scanner;

public class MobileBillCalculator {
    private  static final Scanner scanner = new Scanner(System.in);
    private static final double MONTHLY_FEE = 125.00;
    private static final double MINUTE_RATE_BETWEEN_501_TO_100 = 0.25;
    private static final double MINUTE_RATE_ABOVE_1000 = 0.49;



    public static void main(String[] args) {

        System.out.println("Enter total call duration in minutes : " );
        int minutes = scanner.nextInt();

        double bill;

        if (minutes <= 500 ) {
            bill = MONTHLY_FEE ;
        } else if (minutes <= 1000) {
            bill = MONTHLY_FEE + (minutes - 500) * MINUTE_RATE_BETWEEN_501_TO_100 ;
        } else {
            bill = MONTHLY_FEE + 500 * MINUTE_RATE_ABOVE_1000 + (minutes - 1000) * MINUTE_RATE_ABOVE_1000 ;
        }

        System.out.println("Your monthly bill is : " + bill + " taka.");
    }

}
      /* Enter total call duration in minutes :
        1000
        Your monthly bill is : 250.0 taka. */