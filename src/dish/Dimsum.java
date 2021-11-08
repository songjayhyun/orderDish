package dish;

public class Dimsum extends Dish {

    private String name = "딤섬";
    private String howTo = "숟가락";
    private int price = 8000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHowTo() {
        return howTo;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
