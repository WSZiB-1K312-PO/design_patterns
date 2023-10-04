package pl.edu.wszib.design_patterns.abstract_factory;

public interface Smartphone {
    void callNumber(String number);
    void sendMail(String email, String title, String content);
    void browseInternet();
}
