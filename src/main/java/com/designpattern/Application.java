package com.designpattern;

import java.util.*;
import com.designpattern.util.*;


public class Application {
    // private UserService userService = new UserService();
    // private ModuleService moduleService = new ModuleService();
    private DatabaseInitializer dbInitializer = new DatabaseInitializer();

    public void start() {
        dbInitializer.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Notes Management System");
        while (true) {
            System.out.println("1. Login as Administrator\n2. Login as Professor\n3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleAdminActions();
                    break;
                case 2:
                    handleProfessorActions();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void handleAdminActions() {
        // Implement admin actions: Manage professors, modules, etc.
        System.out.println("Admin actions will be here.");
    }

    private void handleProfessorActions() {
        // Implement professor actions: Enter grades, validate them, etc.
        System.out.println("Professor actions will be here.");
    }
}