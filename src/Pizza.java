public class Pizza {

    private final String name;
    private final int size;
    private final boolean hasCheese;
    private final boolean hasChicken;
    private final boolean hasPepperoni;
    private final boolean hasTuna;
    private final boolean hasMushroom;
    private final boolean hasPineapple;

    public Pizza(String name, int size, boolean hasCheese, boolean hasChicken, boolean hasPepperoni, boolean hasTuna, boolean hasMushroom, boolean hasPineapple) {
        this.name = name;
        this.size = size;
        this.hasCheese = hasCheese;
        this.hasChicken = hasChicken;
        this.hasPepperoni = hasPepperoni;
        this.hasTuna = hasTuna;
        this.hasMushroom = hasMushroom;
        this.hasPineapple = hasPineapple;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", hasCheese=" + hasCheese +
                ", hasChicken=" + hasChicken +
                ", hasPepperoni=" + hasPepperoni +
                ", hasTuna=" + hasTuna +
                ", hasMushroom=" + hasMushroom +
                ", hasPineapple=" + hasPineapple +
                '}';
    }
}
