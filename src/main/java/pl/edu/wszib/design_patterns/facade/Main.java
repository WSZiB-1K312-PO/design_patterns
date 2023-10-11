package pl.edu.wszib.design_patterns.facade;

public class Main {
    public static void main(String[] args) {
        VeryOldSystem veryOldSystem = new VeryOldSystem();

        String username = "ADMIN";

        String parsedUsername = veryOldSystem.parseUserName(username);
        veryOldSystem.registerUserInDB(parsedUsername);
        veryOldSystem.registerInSystem(parsedUsername);
        veryOldSystem.clearCache();

        System.out.println();

        VeryOldSystemFacade systemFacade = new VeryOldSystemFacade(veryOldSystem);
        systemFacade.register("USER");
    }
}
