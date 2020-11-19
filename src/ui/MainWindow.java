package ui;

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class MainWindow {
    public static void main(String[] args) {
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.userName = "ali.mansour";
        loginWindow.fullName = "Ali Mansour Mohamed";
        loginWindow.setData();
        loginWindow.login();
        loginWindow.login();
        loginWindow.login();
    }
}
