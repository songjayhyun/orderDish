package chef;

import dish.Dish;

public class KoreanChef implements Chef {

    @Override
    public Dish makeDish(Dish menuItem) {
            return menuItem;
    }
}
