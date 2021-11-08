package chef;
import dish.Dish;

public class ChineseChef implements Chef {

    @Override
    public Dish makeDish(Dish menuItem) {
            return menuItem;
    }
}
