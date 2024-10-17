package compositePattern;

class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu", "Main Categories");
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning specials");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon delights");

        MenuComponent pancake = new MenuItem("Pancake", "Fluffy pancake with syrup", 5.99);
        MenuComponent sandwich = new MenuItem("Sandwich", "Ham and cheese sandwich", 6.49);
        MenuComponent pasta = new MenuItem("Pasta", "Creamy Alfredo pasta", 8.99);

        breakfastMenu.add(pancake);
        lunchMenu.add(sandwich);
        lunchMenu.add(pasta);

        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);

        mainMenu.print();
    }
}

