package sec05.ch02.ex03;

public class YalcoChicken {
    int no;
    String name;
    ChickenMenu[] menus;


    public YalcoChicken(int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu(String name) {
        for(ChickenMenu menu : menus) {
            if(menu.name.equals(name))
                return menu;
        }
        return null;
    }
}
