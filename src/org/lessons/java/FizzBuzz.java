package org.lessons.java;
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userRange;
        do {
        System.out.print("How many nr do you want? ");
         userRange = Integer.parseInt(scanner.nextLine());
        } while (userRange == 0 || userRange > 1000);

     /*    for (int i = 1; i < userRange + 1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

        }   */

        scanner.close();
        for (int i = 1; i < userRange + 1; i++){
            String output = "";
            if (i % 3 == 0){
              output += "Fizz";
            }
            if (i % 5 == 0){
               output += "Buzz";
            }
            System.out.println(output.length() > 0 ? output : i);

        }


    }

}
