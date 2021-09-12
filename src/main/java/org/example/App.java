package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int price1, amount1, price2, amount2, price3, amount3, price4, amount4;
        double subtotal, tax, total;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        price1 = input1.nextInt();

        Scanner input1a = new Scanner (System.in);
        System.out.println("Enter the quantity of item 1: ");
        amount1 = input1a.nextInt();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter the price of item 2: ");
        price2 = input2.nextInt();

        Scanner input2a = new Scanner (System.in);
        System.out.println("Enter the quantity of item 2: ");
        amount2 = input2a.nextInt();

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter the price of item 3: ");
        price3 = input3.nextInt();

        Scanner input3a = new Scanner (System.in);
        System.out.println("Enter the quantity of item 3: ");
        amount3 = input3a.nextInt();

        Scanner input4 = new Scanner (System.in);
        System.out.println("Enter the price of item 4: ");
        price4 = input4.nextInt();

        Scanner input4a = new Scanner (System.in);
        System.out.println("Enter the quantity of item 4: ");
        amount4 = input4a.nextInt();

        float item1=price1*amount1;
        float item2=price2*amount2;
        float item3=price3*amount3;
        float item4=price4*amount4;

        subtotal=item1+item2+item3+item4;

        tax=.055*subtotal;

        total=tax+subtotal;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);




    }
}
