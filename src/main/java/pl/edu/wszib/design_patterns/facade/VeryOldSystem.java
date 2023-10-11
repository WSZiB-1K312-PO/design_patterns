package pl.edu.wszib.design_patterns.facade;

public class VeryOldSystem {
    String parseUserName(String username) {
        return username.toLowerCase();
    }

    void registerUserInDB(String username) {
        System.out.println("Registering user " + username + " in db");
    }

    void registerInSystem(String username) {
        System.out.println("Register user " + username + " in system");
    }

    void clearCache() {
        System.out.println("Clear cache");
    }
}
