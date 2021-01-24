/*
 * NAME: BISMARK FRIMPONG
 */

import java.util.Scanner;

public class FooCorporation {
     private static int hoursWorked;
     private static double basePay;
     private static double minimumWage = 8.00;
     private static double totalPay;

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Employee "+ i);
            System.out.println("Please enter Base Pay");
            Scanner input = new Scanner(System.in);
            basePay = input.nextDouble();
            System.out.println("Please enter Hours worked");
            hoursWorked = input.nextInt();
            PayCalculator();
        }
    }
    public static void PayCalculator () {

        if ((basePay < minimumWage) || (hoursWorked > 60)) {
            System.out.println("Error");
        } else {
            if (hoursWorked > 40) {
                totalPay = ((hoursWorked * basePay) + ((basePay * 1.5) * (hoursWorked - 40)));
                System.out.println("Total Pay = " + totalPay);
            } else {
                totalPay = hoursWorked * basePay;
                System.out.println("Total pay = " + totalPay);
            }
        }
    }
}
