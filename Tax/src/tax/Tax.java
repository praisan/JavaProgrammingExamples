/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import java.util.Scanner;

/**
 *
 * @author praisan
 */
public class Tax {

    public static void main(String[] args) {
        String menu = "\nMenu\n";
        menu += "1: Input new salary\t";
        menu += "2. Add other income\n";
        menu += "3. Deductions\t\t";
        menu += "4. Tax calculation\n";
        menu += "0. Exit\n";
        menu += "Select menu: 0-4: ";
        int select = 0;
        double amount = 0;
        Scanner input = new Scanner(System.in);
        double totalIncome = 0, additionalIncome = 0, deduction = 0;
        System.out.println("This is a tax calculation program.");
        do {
            System.out.print(menu);
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Input your salary: ");
                    totalIncome = input.nextDouble() * 12;
                    display(totalIncome, additionalIncome, deduction);
                    break;
                case 2:
                    do {
                        System.out.print("Input additional income (0 = stop): ");
                        amount = input.nextDouble();
                        additionalIncome += amount;
                        display(totalIncome, additionalIncome, deduction);
                    } while (amount > 0);
                    break;
                case 3:
                    do {
                        System.out.print("Input deduction amount (0 = stop): ");
                        amount = input.nextDouble();
                        deduction += amount;
                        display(totalIncome, additionalIncome, deduction);
                    } while (amount > 0);
                    break;
                case 4:
                    display(totalIncome, additionalIncome, deduction);
                    System.out.println("Tax: " + tax(totalIncome + additionalIncome - deduction));
                    break;
                case 0:
                    System.out.println("Thank you");
                default:
                    System.out.println("Select only 0-4 !");
            }

        } while (select > 0);

    }

    public static void display(double income, double add, double deduct) {
        System.out.println("-:- Income " + income
                + " (+" + add + " - " + deduct + ") net income= " + (income + add - deduct));
    }

    public static double tax(double netIncome) {
        double tax;
        if (netIncome <= 150000) {
            tax = 0;
        } else if (netIncome <= 300000) {
            tax = .05;
        } else if (netIncome <= 500000) {
            tax = .1;
        } else if (netIncome <= 750000) {
            tax = .15;
        } else if (netIncome <= 1000000) {
            tax = .20;
        } else if (netIncome <= 2000000) {
            tax = .25;
        } else if (netIncome <= 5000000) {
            tax = .30;
        } else {
            tax = .35;
        }

        return netIncome * tax;
    }
}
