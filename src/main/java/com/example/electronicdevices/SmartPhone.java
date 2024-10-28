package com.example.electronicdevices;

public class SmartPhone extends Device{
    double ScreenSize, CameraResolution;
    public double getCameraResolution() {
        return CameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        CameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + deviceType +
                ", name='" + Name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + ScreenSize +
                ", resolution=" + CameraResolution +
                '}';
    }
}
