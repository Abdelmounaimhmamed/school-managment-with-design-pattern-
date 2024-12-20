package com.designpattern.model;


public class Administrator extends User {
    public Administrator(String username, String password) {
        super(username, password);
    }

    public void manageProfessors() {
        // Implement logic to manage professors
    }

    public void manageModules() {
        // Implement logic to manage modules
    }
}
