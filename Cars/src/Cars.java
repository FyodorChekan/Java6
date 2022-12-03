import java.util.*;

public enum Cars {
    KIA("Kia", 220, Model.RIO.getName(), 1000000, Colour.RED.getName()),
    FORD("Ford", 240, Model.FOCUS.getName(), 1500000, Colour.GRAY.getName()),
    LADA("Lada", 180, Model.KALINA.getName(), 500000, Colour.WHITE.getName()),
    BMW("BMW", 320, Model.M4.getName(), 7000000, Colour.BLUE.getName()),
    AUDI("Audi,", 280, Model.Q8.getName(), 6500000, Colour.BLACK.getName());

    private String model;
    private int maxSpeed;
    private String mark;
    private final int price;
    private String colour;

    Cars(String model, int maxSpeed, String mark, int price, String colour) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public static List<Cars> asList() {
        ArrayList<Cars> list = new ArrayList<Cars>();
        Collections.addAll(list, values());
        return list;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'';
    }
}
