package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to Lexicon Cafe, what is your name? ");
        String name = sc.nextLine();

        System.out.println("\nHi " + name + "! Here is our menu:");
        System.out.println("==============================");
        System.out.println("Lexicon Cafe");
        System.out.println("==============================");
        System.out.println("1. Espresso         25.00 SEK");
        System.out.println("2. Cappuccino       35.00 SEK");
        System.out.println("3. Latte            40.00 SEK");
        System.out.println("4. Croissant        30.00 SEK");
        System.out.println("5. Sandwich         55.00 SEK");
        System.out.println("==============================");

        System.out.print("Enter item number (1-5): ");
        int itemNumber = sc.nextInt();

        System.out.print("How many? ");
        int quantity = sc.nextInt();

        // Rensa scannerns radbrytning innan vi läser nästa textsträng
        sc.nextLine();

        System.out.print("Loyalty member? (yes/no): ");
        String loyaltyInput = sc.nextLine();

        // Variabler för att hålla reda på valet
        String itemName = "";
        double pricePerItem = 0.0;

        // Logik för att välja rätt produkt och pris baserat på nummer
        switch (itemNumber) {
            case 1:
                itemName = "Espresso";
                pricePerItem = 25.00;
                break;
            case 2:
                itemName = "Cappuccino";
                pricePerItem = 35.00;
                break;
            case 3:
                itemName = "Latte";
                pricePerItem = 40.00;
                break;
            case 4:
                itemName = "Croissant";
                pricePerItem = 30.00;
                break;
            case 5:
                itemName = "Sandwich";
                pricePerItem = 55.00;
                break;
            default:
                System.out.println("Invalid item number!");
                return; // Avslutar programmet om man väljer fel nummer
        }

        // Uträkningar
        double subtotal = pricePerItem * quantity;
        double discount = 0.0;

        boolean isLoyal  = loyaltyInput.equalsIgnoreCase("yes");
        boolean overLimit = subtotal > 150.00;

        if (loyaltyInput.equalsIgnoreCase("yes")) {
            discount = subtotal * 0.15;
        }
        if(!isLoyal && overLimit) {
            discount = subtotal * 0.10;
        }
        double priceAfterDiscount = subtotal - discount;
        double vat = priceAfterDiscount * 0.12;
        double total = priceAfterDiscount + vat;




        // Utskrift av kvittot
        System.out.println("\n==============================");
        System.out.println("         Lexicon Cafe         ");
        System.out.println("==============================");
        System.out.println("Customer: " + name);
        System.out.println("Item:     " + itemName + " x" + quantity);
        System.out.printf("Subtotal: %.2f SEK\n", subtotal);

        if (discount > 0) {
            System.out.printf("Discount: -%.2f SEK \n", discount);
        } else{
            System.out.printf("Discount: -%.2f SEK \n", discount);
        }

        System.out.printf("VAT  : %.2f SEK\n", vat);
        System.out.println("------------------------------");
        System.out.printf("TOTAL:    %.2f SEK\n", total);
        System.out.println("==============================");
        System.out.println("   Thank you for your visit!  ");

        // Stäng scannern när vi är klara
        sc.close();
    }
}
