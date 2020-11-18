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

    User(String firstName, String lastName, int age, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userName = userName;
        this.password = password;
    }

    String getFullName() {
        return firstName + " " + lastName;
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
}
