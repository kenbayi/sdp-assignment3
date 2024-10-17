package compositePattern;

import java.util.ArrayList;
import java.util.List;

class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }


    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public void print() {
        System.out.println("\nMenu: " + name + ", " + description);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}

