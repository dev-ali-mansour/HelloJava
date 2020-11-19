/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class CallClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int data = myClass.data;
        System.out.println("data before change: " + data);
//        myClass.changeData(200);
        myClass.changeData(myClass,200);
        System.out.println("data before change: " + myClass.data);
    }
}
