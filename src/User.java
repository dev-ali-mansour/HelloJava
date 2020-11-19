/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class User {
    String firstName;
    String lastName;
    int age;
    String userName;
    String password;
    static int count = 0;

    User() {
        count++;
    }

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    User(String firstName, String lastName, int age, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userName = userName;
        this.password = password;
        count++;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    String getFullName(char ch) {
        return "" + ch + ch + " " + firstName + " " + lastName + " " + ch + ch;
    }

    static int getCount(){
        return count;
    }

    int getAge() {
        return age;
    }

    boolean login() {
        if (userName.equalsIgnoreCase("user") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    boolean login(String ipAddress) {
        if (ipAddress.equals("192.168.1.10")) return false;
        if (userName.equalsIgnoreCase("user") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

}
