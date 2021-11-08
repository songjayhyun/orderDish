package dish;

public class Galbi extends Dish {

    private String name = "갈비";
    private String howTo = "젓가락";
    private int price = 10000;

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
