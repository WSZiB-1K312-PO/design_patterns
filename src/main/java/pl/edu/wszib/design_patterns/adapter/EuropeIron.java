package pl.edu.wszib.design_patterns.adapter;

public class EuropeIron implements EuropePowerReceiver {
    @Override
    public void accept(EuropePowerOutlet outlet) {
        outlet.give240V();
        System.out.println("Getting hot");
    }
}
