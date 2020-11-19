import java.util.Scanner;

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Authentication System");
        System.out.print("Please enter your user name:");
        String username = scanner.nextLine();
        System.out.print("Please enter your password:");
        String password = scanner.nextLine();
        if ((username.equalsIgnoreCase("admin") || username.equals("user")) && password.equals("password")) {
            if (username.equalsIgnoreCase("admin")) System.out.println("Welcome to Admin area");
            else System.out.println("You don't have permission!");
            System.out.println("Welcome back " + username);
        } else System.out.println("Invalid username or password!");
    }
}
