package org.lessons.java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TrainTicket {
    public static void main(String[] args) {
        // get inputs and ini scanner
        Scanner scanner = new Scanner(System.in);
        int userAge;
        int distance;
        System.out.print("What is your age? ");
        userAge = Integer.parseInt(scanner.nextLine());
        System.out.print("How far would you travel?(km) ");
        distance = Integer.parseInt(scanner.nextLine());

        double price;
        double discount;
        double total;


        if (userAge <= 18){
            price = (double) distance * 0.21;
            discount = (price * 20 ) / 100;
        } else if (userAge >= 65){
            price = (double) distance * 0.21;
            discount = (price * 40 ) / 100;
        } else {
            price = (double) distance * 0.21;
            discount = 0;
        }

        total = price - discount;

        String formattedTotal = new DecimalFormat("#.##").format(total);
        System.out.println("€ " +formattedTotal);


    }
}