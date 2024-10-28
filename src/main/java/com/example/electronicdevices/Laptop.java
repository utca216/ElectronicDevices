package com.example.electronicdevices;

public class Laptop extends Device {
    public Laptop() {}
    private int RAMSize;
    private String ProcessorType;

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public String getProcessorType() {
        return ProcessorType;
    }

    public void setProcessorType(String processorType) {
        ProcessorType = processorType;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + deviceType +
                ", name='" + Name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", RAM size=" + RAMSize +
                ", processor type=" + ProcessorType +
                '}';
    }
}
