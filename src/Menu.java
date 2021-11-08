import dish.Dish;

import java.util.List;

public class Menu {

    private List<Dish> items;

    public Menu(List<Dish> items) {
        this.items = items;
    }

    public Dish choose(String name) {
        for(Dish each : items) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }
}
