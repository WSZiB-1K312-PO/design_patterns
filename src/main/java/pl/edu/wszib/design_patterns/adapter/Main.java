package pl.edu.wszib.design_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        USPowerOutlet usPowerOutlet = new USWallPowerOutlet();
        EuropePowerOutlet europePowerOutlet = new EuropeWallPowerOutlet();

        USPowerReceiver lamp = new USLamp();
        EuropePowerReceiver iron = new EuropeIron();

        lamp.accept(usPowerOutlet);
        System.out.println();
        iron.accept(europePowerOutlet);
        System.out.println();
        iron.accept(new USToEuropePowerAdapter(usPowerOutlet));
        lamp.accept(new EuropeToUSPowerAdapter(europePowerOutlet));
    }
}
