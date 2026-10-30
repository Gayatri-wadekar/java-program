// package com.oops;
import java.util.Scanner;

class Auth {

    // Login using email
    public void login(String email, String password) {

        if (email.equals("a@gmail.com") && password.equals("123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }

    // Login using phone
    public void login(long phone, String password) {

        if (phone == 1234567890L && password.equals("123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        Auth a = new Auth();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Login using email");
        System.out.println("2. Login using phone");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                a.login(email, password);
                break;

            case 2:
                System.out.print("Enter phone: ");
                long phone = sc.nextLong();
                sc.nextLine();

                System.out.print("Enter password: ");
                String pass = sc.nextLine();

                a.login(phone, pass);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
