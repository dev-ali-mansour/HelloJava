/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 *//*


class CallClass {
    int data = 100;

    void changeData(int value) {
        data += value;
    }

    void changeData(CallClass callClass, int value) {
        callClass.data = value;
    }

    public static void main(String[] args) {
        CallClass callClass = new CallClass();
        System.out.println("data before change: " + callClass.data);
        callClass.changeData(200);
//        myClass.changeData(myClass,200);
        System.out.println("data before change: " + callClass.data);
    }
}

*/

class CallClass {
    int data = 100;

    void change(int value) {
        value += 100;//changes will be in the local variable only
    }

    void change(CallClass callClass, int value) {
        callClass.data += value;
    }

    public static void main(String args[]) {

        CallClass callClass = new CallClass();
        System.out.println("Call By value");
        System.out.println("before change " + callClass.data);
        callClass.change(200);
        System.out.println("after change " + callClass.data);

        System.out.println("Call By reference");
        CallClass callClass2 = new CallClass();
        System.out.println("before change " + callClass2.data);
        callClass2.change(callClass2, 200);
        System.out.println("after change " + callClass2.data);

    }
}
