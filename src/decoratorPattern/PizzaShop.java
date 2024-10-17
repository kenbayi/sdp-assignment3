package decoratorPattern;

class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        pizza = new CheeseTopping(pizza);

        System.out.println(pizza.getDescription() + " - Total Cost: $" + pizza.getCost());

        Pizza magPizza = new MargheritaPizza();
        magPizza = new PepperoniTopping(magPizza);
        magPizza = new CheeseTopping(magPizza);

        System.out.println(magPizza.getDescription() + " - Total Cost: $" + magPizza.getCost());
    }
}

