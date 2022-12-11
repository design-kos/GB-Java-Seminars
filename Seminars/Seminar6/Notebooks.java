package Seminars.Seminar6;

public class Notebooks {
    private String model;
    private int screenSize;
    private int ramSize;
    private int vramSize;
    private int diskSize;
    private String os;
    private int price;

    public Notebooks(String model, int screenSize, int ramSize, int vramSize, int diskSize, String os, int price) {
        this.model = model;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.vramSize = vramSize;
        this.diskSize = diskSize;
        this.os = os;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getVramSize() {
        return vramSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String getOs() {
        return os;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}