package pl.edu.wszib.design_patterns.chain_of_responsibility.exception;

public class AuthException extends RuntimeException {
    public AuthException() {
        super("No auth!");
    }
}
