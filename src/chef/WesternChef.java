package chef;

import dish.Dish;

public class WesternChef implements Chef {

    @Override
    public Dish makeDish(Dish menuItem) {
            return menuItem;
    }
}
