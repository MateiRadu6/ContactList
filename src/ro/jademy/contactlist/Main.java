package ro.jademy.contactlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        try {
            phonebook.addContact("", "", "");
        } catch (Exception e) {
            // TOOD: request another input
        }


    }



    public static void mainMenu() {

        System.out.println("1. Show all contacts");
        System.out.println("2. Search");
        System.out.println("3. Add new contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5: {
                System.exit(0);
                break;
            }
        }

        mainMenu();
    }
}
