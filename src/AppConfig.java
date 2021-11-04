import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppConfig {

    List<Dish> dish = new ArrayList<Dish>();

    public List<Dish> dishList() {
        dish.add(new Galbi());
        dish.add(new Pasta());
        dish.add(new Dimsum());
        return dish;
    }

    public Chef chef(Dish menuItem) {
        if (menuItem instanceof Galbi) {
            return new KoreanChef();
        }

        if (menuItem instanceof Pasta) {
            return new WesternChef();
        }

        if (menuItem instanceof Dimsum) {
            return new ChineseChef();
        }

        throw new IllegalStateException("해당 요리를 할 수 있는 셰프가 없습니다.");
    }
}