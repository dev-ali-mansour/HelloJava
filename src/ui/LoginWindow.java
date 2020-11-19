package ui;

/**
 * HelloJava Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- HelloJava IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class LoginWindow {
    String userName;
    String password;
    public String fullName;
    private int age;
    private int failedCount = 0;

    public LoginWindow() {
        setData();
    }

    public void setData() {
        userName = "admin";
        fullName = "System Administrator";
        age = 35;
    }

    public boolean login() {
        if (failedCount >= 3) return false;
        String encryptedPassword = encrypt(this.password);
        if (userName.equalsIgnoreCase("admin") && encryptedPassword.equals("123456")) {
            return true;
        } else {
            failedCount++;
            return false;
        }
    }

    private String encrypt(String password) {
        return "***" + password + "###";
    }

}
