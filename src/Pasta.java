public class Pasta extends Dish {

    private String name = "파스타";
    private String howTo = "젓가락";
    private int price = 12000;

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
