/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Car {
    String mark;
    int wheels;
    String color;
    int model;

    void turnOn() {
        System.out.println("Start engine");
    }

    void turnOff() {
        System.out.println("Stop engine");
    }

    void moveForward() {
        System.out.println("Move forward");
    }

    void moveBack() {
        System.out.println("move back");
    }

    void intro() {
        System.out.println("Mark: " + mark);
        System.out.println("Wheels: " + wheels);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}
