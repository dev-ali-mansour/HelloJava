import java.util.Scanner;

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Loops {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        /*for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i);
        }
        System.out.println("Loop ended");*/

//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        int factorial = 1;
//        for (int i = 2; i <= num; i++) {
//            factorial *= i;
//        }

//        for (int i = num; i >= 2; i--) {
//            factorial *= i;
//        }
//        System.out.println("Factorial = " + factorial);

//        System.out.print("Enter base: ");
//        int base = scanner.nextInt();
//        System.out.print("Enter power: ");
//        int result = 1;
//        int power = scanner.nextInt();
//        for (int i = 1; i <= power; i++) {
//            result = result * base;
//        }
//        System.out.println("Result = " + result);

//        for (int i = 10; i > 5; i++) {
//            System.out.println("Number = " + i);
//            if (i == 20) break;
//        }

//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        int factorial = 1;
//        int i = 2;
//        while (i <= num) {
//            factorial *= i;
//            i++;
//        }
//        System.out.println("Factorial = " + factorial);

//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        int factorial = 1;
//        int i = num;
//        while (i >= 2) {
//            factorial *= i;
//            i--;
//        }
//        System.out.println("Factorial = " + factorial);

//        int x = 10;
//        while (x > 3) {
//            System.out.println("Number " + x);
//            if (x == 30) break;
//            x++;
//        }

//        int i = 1;
//        do {
//            System.out.println("Hello Java!");
//            i++;
//        } while (i <= 10);

        System.out.println("University System");
        System.out.println("===================");
        char ch;
        String result = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Student name: ");
            String name = scanner.nextLine();
            System.out.print("Level: ");
            byte level = scanner.nextByte();
            System.out.print("Points: ");
            byte points = scanner.nextByte();
            String status;
            if (points > 60) status = "Succeed";
            else status = "failed";
            result += "===================\nName: " + name + "\nLevel: " + level + "\npoints: "
                    + points + "\nStatus: " + status + "\n";
            System.out.print("Record saved, Press y to continue: ");
            ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.print(result);
    }
}
