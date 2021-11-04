public class ChineseChef implements Chef {

    @Override
    public Dish makeDish(Dish menuItem) {
            return new Dimsum();

    }
}
