public class Customer {

    AppConfig appConfig = new AppConfig();
    Menu menu = new Menu(appConfig.dishList());
    Chef chef = appConfig.chef();

    public void order(String menuName) {
        Dish menuItem = menu.choose(menuName);
        Dish dish = chef.makeDish(menuItem);
        System.out.println("음식 = " + dish.getName());
        System.out.println("가격 = " + dish.getPrice());
        System.out.println("먹는 법 = " + dish.getHowTo());
    }
}
