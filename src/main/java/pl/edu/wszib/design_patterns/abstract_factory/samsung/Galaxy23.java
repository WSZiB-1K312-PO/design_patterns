package pl.edu.wszib.design_patterns.abstract_factory.samsung;

import pl.edu.wszib.design_patterns.abstract_factory.Smartphone;

public class Galaxy23 implements Smartphone {
    @Override
    public void callNumber(String number) {
        System.out.println("Call: " + number);
    }

    @Override
    public void sendMail(String email, String title, String content) {
        System.out.println("Open Gmail app");
        System.out.println("Send email to " + email + " title: " + title + " content: " + content);
    }

    @Override
    public void browseInternet() {
        System.out.println("Open Chrome app");
    }
}
