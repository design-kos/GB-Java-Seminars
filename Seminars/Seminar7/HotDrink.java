package Seminars.Seminar7;

public class HotDrink extends Product {

    private int temperature;

    private double volume;

    public HotDrink(String name, int quantity, int price, int temperature, double volume) {
        super(name, quantity, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String toString() {
        return "Название: " + super.getName() + ", Кол-во: " + super.getQuantity() + ", Цена: " + super.getPrice()
                + ", Объём: " + volume;
    }

}
