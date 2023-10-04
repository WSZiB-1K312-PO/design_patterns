package pl.edu.wszib.design_patterns.abstract_factory.samsung;

import pl.edu.wszib.design_patterns.abstract_factory.Smartphone;
import pl.edu.wszib.design_patterns.abstract_factory.SmartphoneFactory;

public class SamsungFactory implements SmartphoneFactory {
    @Override
    public Smartphone createSmartphone(String generation) {
        return new Galaxy23();
    }
}
