package main;

import user.IUser;
import user.NormalUser;

public class APICont {
    public static void main(String[] args) {
        IUser u = new NormalUser();
        u.signUp();
        u.login();
    }
}