import chef.Chef;
import config.AppConfig;
import dish.Dish;

public class Customer {

    AppConfig appConfig = new AppConfig();
    Menu menu = new Menu(appConfig.dishList());


    public void order(String menuName) {
        Dish menuItem = menu.choose(menuName);
        Chef chef = appConfig.chef(menuItem);
        Dish dish = chef.makeDish(menuItem);
        System.out.println("음식 = " + dish.getName());
        System.out.println("가격 = " + dish.getPrice());
        System.out.println("먹는 법 = " + dish.getHowTo());
    }
}
