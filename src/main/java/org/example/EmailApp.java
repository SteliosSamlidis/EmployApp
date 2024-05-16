package org.example;

import java.util.Scanner;

public class EmailApp {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private String companySuffix = "company.com";
    private String alternateEmail;

    // Constructor for firstname
    public EmailApp() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter first name and last name
        System.out.println("Enter your first name and last name");

        // Read the first and last names from the input
        System.out.print("First name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("The following employ is being added: " + this.firstName
                + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("The assigned department is:" + this.department);


        this.password = RandomStringGenerator.generateRandomString(12);
        System.out.println("Password created: " + this.password);

        email = firstName.toLowerCase() + lastName.toLowerCase()
                + "." + department + "@" + companySuffix;
        System.out.println("Your email is " + email);

        System.out.println("Set an alternate email");
        this.alternateEmail = scanner.nextLine();
        System.out.println("The alternate email has been set to: " + alternateEmail);

    }

    public String setDepartment() {
        System.out.println("Enter the department:\n1 for Development\n2 for Sales\n3 for Accounting\n4 for None");
        System.out.print("Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        // Consume newline

        // Set department based on user input
        switch (depChoice) {
            case 1:
                return "Development";
            case 2:
                return "Sales";
            case 3:
                return "Accounting";
            default:
                return "None";


        }
    }



}