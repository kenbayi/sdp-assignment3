package compositePattern;

class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;

    public MenuItem(String name, String description, double price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Item: " + getName() + ", Price: $" + getPrice() + ", Description: " + getDescription());
    }
}

