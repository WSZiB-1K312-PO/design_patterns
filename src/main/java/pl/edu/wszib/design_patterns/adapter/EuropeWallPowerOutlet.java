package pl.edu.wszib.design_patterns.adapter;

public class EuropeWallPowerOutlet implements EuropePowerOutlet {
    public void give240V() {
        System.out.println("Give 230V");
    }
}
