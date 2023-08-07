public class Director {

    public void buildMargherita(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Margherita");
    }
    public void buildPepperoni(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Pepperoni");
        pizzaBuilder.setHasPepperoni(true);
    }
    public void buildHawaiian(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Hawaiian");
        pizzaBuilder.setHasPineapple(true);
    }
    public void buildFunghi(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Funghi");
        pizzaBuilder.setHasMushroom(true);
    }
    public void buildChicken(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Chicken");
        pizzaBuilder.setHasChicken(true);
    }
    public void buildCustomized(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setName("Pizza Customized");
    }
}
