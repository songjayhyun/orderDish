package config;

import chef.Chef;
import chef.ChineseChef;
import chef.KoreanChef;
import chef.WesternChef;
import dish.Dimsum;
import dish.Dish;
import dish.Galbi;
import dish.Pasta;

import java.util.ArrayList;
import java.util.List;

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