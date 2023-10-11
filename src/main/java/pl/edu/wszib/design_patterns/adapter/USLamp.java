package pl.edu.wszib.design_patterns.adapter;

public class USLamp implements USPowerReceiver {
    @Override
    public void accept(USPowerOutlet outlet) {
        outlet.give120V();
        System.out.println("Give light");
    }
}
