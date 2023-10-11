package pl.edu.wszib.design_patterns.adapter;

public class EuropeToUSPowerAdapter implements USPowerOutlet {
    private final EuropePowerOutlet outlet;

    public EuropeToUSPowerAdapter(EuropePowerOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public void give120V() {
        outlet.give240V();
        System.out.println("Change 240V to 120V");
    }
}
