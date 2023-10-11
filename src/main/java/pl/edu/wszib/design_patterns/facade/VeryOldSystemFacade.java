package pl.edu.wszib.design_patterns.facade;

public class VeryOldSystemFacade {
    private final VeryOldSystem veryOldSystem;


    public VeryOldSystemFacade(VeryOldSystem veryOldSystem) {
        this.veryOldSystem = veryOldSystem;
    }

    void register(String username) {
        String parsedUsername = veryOldSystem.parseUserName(username);
        veryOldSystem.registerUserInDB(parsedUsername);
        veryOldSystem.registerInSystem(parsedUsername);
        veryOldSystem.clearCache();
    }
}
