package pl.edu.wszib.design_patterns.abstract_factory.apple;

import pl.edu.wszib.design_patterns.abstract_factory.Smartphone;
import pl.edu.wszib.design_patterns.abstract_factory.SmartphoneFactory;
import pl.edu.wszib.design_patterns.abstract_factory.apple.IPhone14;
import pl.edu.wszib.design_patterns.abstract_factory.apple.IPhone15;

public class AppleFactory implements SmartphoneFactory {
    @Override
    public Smartphone createSmartphone(String generation) {
        if(generation.equals("latest")) {
            return new IPhone15();
        } else {
            return new IPhone14();
        }
    }
}
