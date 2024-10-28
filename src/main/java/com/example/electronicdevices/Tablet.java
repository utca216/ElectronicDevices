package com.example.electronicdevices;

public class Tablet extends Device{
    public Tablet() {}
    private double batteryLife;
    boolean hasStylus;

    private boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    @Override
    public String toString() {
        return "Tablet{" +
                "type=" + deviceType +
                ", name='" + Name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", battery life=" + batteryLife +
                ", has stylus?=" + hasStylus +
                '}';
    }
}
