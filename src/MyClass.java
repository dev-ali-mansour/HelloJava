/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class MyClass {
    int data = 100;

    void changeData(int value) {
        this.data = value;
    }

    void changeData(MyClass myClass, int value) {
        myClass.data = value;
    }
}
