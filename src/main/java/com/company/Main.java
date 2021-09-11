package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        int price1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the price of item 2: ");
        int price2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the price of item 3: ");
        int price3 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = Integer.parseInt(scan.nextLine());
        double subtotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double tax = subtotal *0.055;
        double total = tax + subtotal;
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
