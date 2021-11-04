public class WesternChef implements Chef {

    @Override
    public Dish makeDish(Dish menuItem) {
            return new Pasta();
    }
}
