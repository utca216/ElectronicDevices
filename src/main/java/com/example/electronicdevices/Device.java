package com.example.electronicdevices;

public class Device {
    public enum Type{
        SMARTPHONE,
        TABLET,
        LAPTOP
    }
    protected Type deviceType;
    protected String Name;
    protected double price;
    protected double weight;

    public Type getDeviceType() {
        return deviceType;
    }

    public String getName() {
        return Name;
    }

    public void setType(Type deviceType) {
        this.deviceType = deviceType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public Device(Type deviceType, String name, double price, double weight) {
        this.deviceType = deviceType;
        Name = name;
        this.price = price;
        this.weight = weight;
    }
    public Device() {
    }


}
