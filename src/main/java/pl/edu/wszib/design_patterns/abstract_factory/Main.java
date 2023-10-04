package pl.edu.wszib.design_patterns.abstract_factory;

import pl.edu.wszib.design_patterns.abstract_factory.apple.AppleFactory;
import pl.edu.wszib.design_patterns.abstract_factory.samsung.SamsungFactory;
import pl.edu.wszib.design_patterns.abstract_factory.singleton.TrueSingleton;

public class Main {
    public static void main(String[] args) {
        Smartphone samsungSmartphone = createFactory("Samsung").createSmartphone("old");
        samsungSmartphone.browseInternet();

        Smartphone iPhone = createFactory("Apple").createSmartphone("latest");
        iPhone.callNumber("000000000");
    }


    public static SmartphoneFactory createFactory(String company) {
        switch (company) {
            case "Samsung":
                return new SamsungFactory();
            case "Apple":
                return new AppleFactory();
            default:
                throw new RuntimeException("Unknown company " + company);
        }
    }
}
