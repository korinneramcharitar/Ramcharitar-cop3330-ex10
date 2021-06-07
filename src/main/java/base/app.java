
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;

//Working with multiple inputs and currency can introduce some tricky precision issues.
//Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

//Enter the price of item 1: 25
//Enter the quantity of item 1: 2
//Enter the price of item 2: 10
//Enter the quantity of item 2: 1
//Enter the price of item 3: 4
//Enter the quantity of item 3: 1
//Subtotal: $64.00
//Tax: $3.52
//Total: $67.52

//Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
//Be sure you explicitly convert input to numerical data before doing any calculations
import java.text.DecimalFormat;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        String food1 = input.nextLine();
        System.out.println("Enter the quantity of item 1:");
        String num1 = input.nextLine();
        System.out.println("Enter the price of item 2:");
        String food2 = input.nextLine();
        System.out.println("Enter the quantity of item 2:");
        String num2 = input.nextLine();
        System.out.println("Enter the price of item 3:");
        String food3 = input.nextLine();
        System.out.println("Enter the quantity of item 3:");
        String num3 = input.nextLine();

        int a = Integer.parseInt(food1);
        int b = Integer.parseInt(food2);
        int c = Integer.parseInt(food3);
        int d = Integer.parseInt(num1);
        int e = Integer.parseInt(num2);
        int f = Integer.parseInt(num3);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        int Subtotal = ((a * d) + (b * e) + (c * f));
        System.out.println("Subtotal: $" + (formatter.format(Subtotal)));
        double Tax = (Subtotal * 0.055);
        System.out.println("Tax: $"+ Tax);
        double Total = (Tax + Subtotal);
        System.out.println("Total: $" + Total);


    }
}
