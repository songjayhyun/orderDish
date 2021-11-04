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

    public Chef chef() {

        return
//                new KoreanChef();
                 new ChineseChef();
//              new WesternChef();
     }

}

