package se.lexicon;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        {


            System.out.print("Welcome to lexicon Cafe what is your name?");
            Scanner sc = new Scanner(System.in);

            String name = sc.nextLine();

            System.out.println(" Hi " + name + "! Here is our menu:");
            System.out.println("==============================");
            System.out.println("Lexicon Cafe");
            System.out.println("==============================");
            System.out.println("1. Espresso         25.00 SEK");
            System.out.println("2. Cappuccino       35.00 SEK");
            System.out.println("3. Latte            40.00 SEK");
            System.out.println("4. Croissant        30.00 SEK");
            System.out.println("5. Sandwich         55.00 SEK");
            System.out.println("==============================");


            System.out.println("Enter item number (1-5)?");
            sc = new Scanner(System.in);

            String Number = sc.nextLine();


            System.out.println("How many?");
            sc = new Scanner(System.in);

            String Quantity = sc.nextLine();

            System.out.println("Loyalty member? (yes/no)");
            sc = new Scanner(System.in);
            String yes = sc.nextLine();
            double nomerber150 = 0.10;
            double vat = 0.12;

            System.out.println("Enter item number (1-5)");
            System.out.println("How many?");
            System.out.println("Loyalty member? (yes/no)");
            System.out.println("==============================");
            System.out.println("Lexicon Cafe");
            System.out.println("==============================");
            System.out.println("Customer : " + name);
            double a = 25.00;
            double b = 35.00;
            double c = 40.00;
            double d = 30.00;
            double e = 55.00;
            Scanner q = new Scanner(Quantity);
            double Quan = q.nextDouble();
            double Discount = 0.15;
            double subtoalA = a * Quan;
            double subtoalB = b * Quan;
            double subtoalC = c * Quan;
            double subtoalD = d * Quan;
            double subtoalE = e * Quan;

            if (Objects.equals(Number, "1")) {
                System.out.println("item : Espressos x " + Quantity);
                System.out.println("Subtotal : " + (a * Quan) + " SEK");
            } else if (Number.equals("2")) {
                System.out.println("item : Cappuccino x " + Quantity);
                System.out.println("Subtotal : " + (b * Quan) + " SEK");
            } else if (Number.equals("3")) {
                System.out.println("item : Latte x " + Quantity);
                System.out.println("Subtotal : " + (c * Quan) + " SEK");
            } else if (Number.equals("4")) {
                System.out.println("item : Croissant x " + Quantity);
                System.out.println("Subtotal : " + (d * Quan) + " SEK");
            } else if (Number.equals("5")) {
                System.out.println("item : Sandwich x " + Quantity);
                System.out.println("Subtotal  :  " + (e * Quan) + " SEk");
            }
            if (yes.equals("yes") && Objects.equals(Number, "1")) {
                System.out.println("Discount : -" + (a * Quan * Discount) + " SEK");
                double priceAfterDiscount = a * Quan * Discount;
                System.out.println("Vat  : " + (a * Quan - priceAfterDiscount) * vat + " SEK");
                double priceAfterVat = (a * Quan - priceAfterDiscount) * vat;
                System.out.println("------------------------------");
                System.out.println("TOTAL : " + (a * Quan - priceAfterDiscount + priceAfterVat) + " SEK");

            } else if (yes.equals("yes") && Objects.equals(Number, "2")) {
                System.out.println("Discount : -" + (b * Quan * Discount) + " SEK");
                double priceAfterDiscount2 = b * Quan * Discount;
                System.out.println("Vat  : " + (b * Quan - priceAfterDiscount2) * vat + " SEK");
                double priceAfterVan2 = (b * Quan - priceAfterDiscount2) * vat;
                System.out.println("------------------------------");
                System.out.println("TOTAL : " + (b * Quan - priceAfterDiscount2 + priceAfterVan2));

            } else if (yes.equals("yes") && Objects.equals(Number, "3")) {
                System.out.println("Discount : -" + c * Quan * Discount + " SEK");
                double priceAfterDiscount3 = c * Quan * Discount;
                System.out.println("Vat  : " + (c * Quan - priceAfterDiscount3) * vat + " SEK");
                double priceAfterVan3 = (c * Quan - priceAfterDiscount3) * vat;
                System.out.println("------------------------------");
                System.out.println("TOTAL : " + (c * Quan - priceAfterDiscount3 + priceAfterVan3));

            } else if (yes.equals("yes") && Objects.equals(Number, "4")) {
                System.out.println("Discount : -" + (d * Quan * Discount) + " SEK");
                double priceAfterDiscount4 = d * Quan * Discount;
                System.out.println("Vat  : " + (d * Quan - priceAfterDiscount4) * vat + " SEK");
                double priceAfterVan4 = (d * Quan - priceAfterDiscount4) * vat;
                System.out.println("-----------------------------");
                System.out.printf("TOTAL : " + (d * Quan - priceAfterDiscount4 + priceAfterVan4) + "SEK");


            } else if (yes.equals("yes") && Objects.equals(Number, "5")) {
                System.out.println("Discount : -" + (e * Quan * Discount) + " SEK");
                double priceAfterDiscount5 = e * Quan * Discount;
                System.out.println("Vat  : " + (e * Quan - priceAfterDiscount5) * vat + " SEK");
                double priceAfterVan5 = (e * Quan - priceAfterDiscount5) * vat;
                System.out.println("------------------------------");
                System.out.println("TOTAL : " + (e * Quan - priceAfterDiscount5 + priceAfterVan5) + " SEK");

            } else if (yes.equals("no") || subtoalA <= 150) ;{
                System.out.println("Discount : - " + (a * Quan * nomerber150) + " SEK");
                double priceAfterDiscountA = a * Quan * nomerber150;
                System.out.println("Vat  : " + (a * Quan - priceAfterDiscountA) * vat + " SEK");
                double priceAfterVatA = (a * Quan - priceAfterDiscountA) * vat;
                System.out.println("--------------------------------");
                System.out.println("Total : " + (a * Quan - priceAfterVatA + vat) + " SEK");

            }
            if (yes.equals("no") || subtoalB <= 150) {
                System.out.println("Discount : - " + (b * Quan * nomerber150) + " SEK");
                double priceAfterDiscountB = b * Quan * nomerber150;
                System.out.println("Vat      : " + (b * Quan - priceAfterDiscountB) * vat + " SEK");
                double priceAfterVatB = (b * Quan - priceAfterDiscountB) * vat;
                System.out.println("-----------------------------");
                System.out.println("Total : " + (b * Quan - priceAfterVatB + vat) + " SEK");

            } else if (yes.equals("no") || subtoalC <= 150) {
                System.out.println("Discount : - " + (c * Quan * nomerber150) + " SEK");
                double priceAfterDiscountC = c * Quan * nomerber150;
                System.out.println("Vat     :" + (c * Quan - priceAfterDiscountC) * vat + " SEK");
                double priceAfterVatC = (c * Quan - priceAfterDiscountC) * vat;
                System.out.println("------------------------------");
                System.out.println("Total  : " + (c * Quan - priceAfterVatC + vat) + " SEK");

            } else if (yes.equals("no") || subtoalD <= 150) {
                System.out.println("Discount : - " + (d * Quan * nomerber150) + " SEK");
                double priceAfterDiscountD = d * Quan * nomerber150;
                System.out.println("Vat     :" + (d * Quan - priceAfterDiscountD) * vat + " SEK");
                double priceAfterVatD = (d * Quan - priceAfterDiscountD) * vat;
                System.out.println("------------------------------");
                System.out.println("Total  : " + (d * Quan - priceAfterVatD + vat) + " SEK");
            } else if (yes.equals("no") || subtoalE <= 150) {
                System.out.println("Discount : - " + (e * Quan * nomerber150) + " SEK");
                double priceAfterDiscountE = e * Quan * nomerber150;
                System.out.println("Vat     :" + (e * Quan - priceAfterDiscountE) * vat + " SEK");
                double priceAfterVatE = (e * Quan - priceAfterDiscountE) * vat;
                System.out.println("-----------------------------");
                System.out.println("Total  : - " + (e * Quan - priceAfterVatE + vat) + " SEK");

            }
            if (yes.equals("no") || subtoalA >= 150) {
                System.out.println("no Discount : ");
                System.out.println("Vat    : " + (a * Quan * vat) + " SEK");
                double priceAfterVat2a = e * Quan * vat;
                System.out.println("-----------------------------");
                System.out.println("Total   : " + (a * Quan + priceAfterVat2a) + " SEK");

            } else if (yes.equals("no") || subtoalB <= 150) {
                System.out.println("no Discount : ");
                System.out.println("Vat    : " + (b * Quan * vat) + " SEK");
                double priceAfterVat2b = b * Quan * vat;
                System.out.println("------------------------------");
                System.out.println("Total   : " + (b * Quan + priceAfterVat2b) + " SEK");

            } else if (yes.equals("no") || subtoalC <= 150) {
                System.out.println("no Discount : ");
                System.out.println("Vat    : " + (c * Quan * vat) + " SEK");
                double priceAfterVat3c = c * Quan * vat;
                System.out.println("-----------------------------");
                System.out.println("Total   : " + (c * Quan + priceAfterVat3c) + " SEK");


            } else if (yes.equals("no") || subtoalD <= 150) {
                System.out.println("no Discount : ");
                System.out.println("Vat    : " + (d * Quan * vat) + " SEK");
                double priceAfterVat4d = d * Quan * vat;
                System.out.println("------------------------------");
                System.out.println("Total   : " + (d * Quan + priceAfterVat4d) + " SEK");

            } else if (yes.equals("no") || subtoalE <= 150) {
                System.out.println("no Discount : ");
                System.out.println("Vat   : " + (d * Quan * vat) + " SEK");
                double priceAfterVat5e = d * Quan * vat;
                System.out.println("-----------------------------");
                System.out.println("Total   : " + (d * Quan + priceAfterVat5e) + " SEK");
            }
        }


    }
}