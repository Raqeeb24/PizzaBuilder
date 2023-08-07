public class PizzaBuilder {
    private String name;
    private int size;
    private boolean hasCheese = true;
    private boolean hasChicken = false;
    private boolean hasPepperoni = false;
    private boolean hasTuna = false;
    private boolean hasMushroom = false;
    private boolean hasPineapple = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
    }

    public void setHasPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public void setHasTuna(boolean hasTuna) {
        this.hasTuna = hasTuna;
    }

    public void setHasMushroom(boolean hasMushroom) {
        this.hasMushroom = hasMushroom;
    }

    public void setHasPineapple(boolean hasPineapple) {
        this.hasPineapple = hasPineapple;
    }

    public Pizza build(){
        return new Pizza(name, size, hasCheese, hasChicken, hasPepperoni, hasTuna, hasMushroom, hasPineapple);
    }
}
