

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Methods {
    final static double PI = 3.14;

    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            welcomeUser();
        }*/

//        welcomeUser2("Mohamed Ahmed");
//        int factorial = calculateFactorial(5);
//        System.out.println(factorial);

//        System.out.println(calculateFactorial(5));
//        Car car = new Car();
//        car.color = "Red";
//        car.mark = "Lancer";
//        car.model = 2018;
//        car.wheels = 4;
//
//        car.turnOn();
//        car.moveForward();
//        car.intro();

        User user = new User("Adel", "Mahmoud", 45, "User", "password");
//        User user2 = new User();
//        User user3 = new User("Ahmed", "Ali");
//        User user1 = new User("Mohamed", "Ahmed", 45, "m.ahmed", "123456");
//        User user4 = new User("Salem", "Hamed", 50);

//        System.out.println("User number: " + user.count);

//        System.out.println(User.getFullName('#'));

//        user.firstName = "Adel";
//        user.lastName = "Mahmoud";
//        user.age = 45;
//        user.userName = "user";
//        user.password = "password";

//        System.out.println(user.login("192.168.1.10"));

//        String userName = user.getFullName();
//        System.out.println("Full name: " + userName);
//        System.out.println("Age: " + user.age);
//        if (user.login()) {
//            System.out.println("Welcome back " + userName);
//        } else {
//            System.out.println("Invalid login data!");
//        }

//        String fullName = user.getFullName('*');
//        System.out.println(fullName);

        System.out.println(calculateCircleArea(5.6));


    }

    /*static void welcomeUser() {
        System.out.println("Hello Java!");
        System.out.println("Welcome to Java course!");
        System.out.println("Android development based on java");
        System.out.println("====================================");
    }*/

    /*static void welcomeUser2(String userName) {
        System.out.println("Welcome back " + userName);
    }*/

    /*static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }*/

    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}
