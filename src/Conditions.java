import java.util.Scanner;

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 Passy Co. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = 85;
//        if (x > 60) {
//            System.out.println("success");
//        }
//        System.out.println("End");

//        int y = 60;
//        if (y == 60) {
//            System.out.println("equal 60");
//        }

//        int x = 14;
//        int y = 25;
//        if (x > 12 && y < 30 && x < y) {
//            System.out.println("success");
//            System.out.println("Second line");
//        }

//        double z = 20.5;
//        double q = 45.8;
//        if (z != 20.5 || q < 30 || z < q) System.out.println("matched");

//        int d = 15;
//        if (!(d < 20 && d ==20)) System.out.println("Less than 20");

//        String username = "user";
//        String password = "123456";
//        if ((username == "admin" || username == "user") && password == "123456") {
//            System.out.println("Logged in successfully");
//        } else {
//            System.out.println("Invalid username or password!");
//        }
//
//        String myMessage;
//        if (username == "admin") {
//            myMessage = "Welcome to Admin area";
//        } else {
//            myMessage = "You don't have permission to access Admin area!";
//        }
//        System.out.println(myMessage);

        // condition ? true value : false value
//        String message = (username == "admin" && password != "") ? "Welcome to Admin area" : "You don't have permission to access Admin area!";
//        System.out.println(message);

        int consumption = 0;
//        if (consumption < 0) System.out.println("Invalid value!");
//        else if (consumption == 0) System.out.println("No consumption!");
//        else if (consumption < 50) System.out.println("Level 1");
//        else if (consumption < 100) System.out.println("Level 2");
//        else if (consumption < 300) System.out.println("Level 3");
//        else {
//            System.out.println("Level 4");
//            System.out.println("You have reached the highest level!");
//        }

        if (consumption == 0) System.out.println("No consumption!");
        else if (consumption == 50) System.out.println("Level 1");
        else if (consumption == 100) System.out.println("Level 2");
        else if (consumption == 300) System.out.println("Level 3");
        else {
            System.out.println("Level 4");
            System.out.println("You have reached the highest level!");
        }

        switch (consumption) {
            case 0 -> System.out.println("No consumption!");
            case 50 -> System.out.println("Level 1");
            case 100 -> System.out.println("Level 2");
            case 300 -> System.out.println("Level 3");
            default -> {
                System.out.println("Level 4");
                System.out.println("You have reached the highest level!");
            }
        }

//        int age = scanner.nextInt();
//        age++;
//        System.out.println("Your age: " + age);
//        String fullName=scanner.nextLine();
//        System.out.println("Welcome back "+fullName);
//        double weight = scanner.nextDouble();
//        weight++;
//        System.out.println("Weight: "+weight);
//        String message;
//        String userName = scanner.nextLine();
//
//        switch (userName) {
//            case "admin":
//                message = "Welcome to Admin area";
//                message += " ";
//                message += userName;
//                break;
//            case "user":
//                message = "You don't have permission to access Admin area!";
//                break;
//            default:
//                message = "Invalid user name!";
//        }
//
//        System.out.println(message);

        int grade = 41;
        switch (grade) {
            case 40, 41:
                System.out.println("Failed");
                break;
            case 60:
                System.out.println("Accepted");
                break;
            case 80:
                System.out.println("Good");
                break;
            case 90:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Not defined!");
                break;
        }
    }
}

/*
Authentication system
1- Print Authentication system
2- Please enter your user name:
3- Please enter your password:
4- Check username equal user or admin and password = password
5- if user name is admin, Welcome to Admin area
6- id user name is user , You don't have permission
7- if not authenticated: Invalid user name or password!
8- if authenticated Welcome back user name
*/
