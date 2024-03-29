package ui;

import java.util.Scanner;

public class UiMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void showMenu(){
        System.out.println("Welcome to MyAppointments");
        System.out.println("Select your option");

        int response;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sn = new Scanner(System.in);
            response = Integer.parseInt(sn.nextLine());

            switch (response) {
                case 1 -> System.out.println("Doctor");
                case 2 -> {
                    System.out.println("Patient");
                    showPatientMenu();
                }
                case 0 -> System.out.println("Thank you for visiting");
                default -> System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    static void showPatientMenu(){
        int response;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sn = new Scanner(System.in);
            response = Integer.parseInt(sn.nextLine());

            switch (response) {
                case 1 -> {
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                }
                case 2 -> System.out.println("::My appointments");
                case 0 -> showMenu();
            }
        } while (response != 0);
    }
}
