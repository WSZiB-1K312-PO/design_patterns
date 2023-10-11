package pl.edu.wszib.design_patterns.adapter;

public class USWallPowerOutlet implements USPowerOutlet {
    public void give120V() {
        System.out.println("Give 120V");
    }
}
