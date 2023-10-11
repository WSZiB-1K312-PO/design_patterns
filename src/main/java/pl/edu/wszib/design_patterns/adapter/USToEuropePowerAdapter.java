package pl.edu.wszib.design_patterns.adapter;

public class USToEuropePowerAdapter implements EuropePowerOutlet {
    private final USPowerOutlet outlet;

    public USToEuropePowerAdapter(USPowerOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public void give240V() {
        outlet.give120V();
        System.out.println("Change 120V to 240V");
    }
}
