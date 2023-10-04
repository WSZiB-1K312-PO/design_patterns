package pl.edu.wszib.design_patterns.abstract_factory.apple;

import pl.edu.wszib.design_patterns.abstract_factory.Smartphone;

public class IPhone14 implements Smartphone {
    @Override
    public void callNumber(String number) {
        System.out.println("Call: " + number);
    }

    @Override
    public void sendMail(String email, String title, String content) {
        System.out.println("Open Mail app");
        System.out.println("Send email to " + email + " title: " + title + " content: " + content);
    }

    @Override
    public void browseInternet() {
        System.out.println("Open Safari app");
    }
}
