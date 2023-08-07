import java.sql.SQLOutput;
import java.util.Scanner;

public class Order {
    Scanner scanner = new Scanner(System.in);
    private boolean validPizza = false;
    private boolean validSize = false;
    private boolean validIngredient = false;
    private int pizzaNum;
    private int pizzaSize;
    private final String errorMessage = "Invalid input. Try again!\n";
    public void start(){
        System.out.println("Hello and welcome to the fastest pizza delivery service on earth!");
        selectPizza();
        selectSize();
        checkout();
    }
    public void selectPizza(){
        while (!validPizza){
            System.out.print("Menu:\n" +
                    "1. Margherita Pizza\n" +
                    "2. Pepperoni Pizza\n" +
                    "3. Hawaiian Pizza\n" +
                    "4. Funghi Pizza\n" +
                    "5. Chicken Pizza\n" +
                    "10. Customized Pizza\n" +
                    "0. Exit\n" +
                    "\n" +
                    "Enter the number of your choice: ");



            try{
                String input = scanner.nextLine();
                int pizzaNum = Integer.parseInt(input);
                if(pizzaNum == 0){
                    System.exit(0);
                }else if (pizzaNum > 0 && pizzaNum <= 10){
                    if (pizzaNum == 10){
                        System.out.println("custom order...");
                    }
                    this.pizzaNum = pizzaNum;
                    validPizza = true;
                }else{
                    System.out.println(errorMessage);
                }
            }catch(Exception e){
                System.out.println(errorMessage);
                validPizza = false;
            }
        }
    }
    public void  selectSize(){
        while(!validSize){
            System.out.println("Please select the size of the pizza.\n" +
                    "1. Standard: 30cm\n" +
                    "2. Large: 35cm\n" +
                    "3. X-tra Large: 40cm");
            try{
                String input = scanner.nextLine();
                int sizeNum = Integer.parseInt(input);
                if (sizeNum > 0 && sizeNum <= 3){
                    this.pizzaSize = sizeNum;
                    validSize = true;
                }else{
                    System.out.println(errorMessage);
                }
            }catch(Exception e){
                System.out.println(errorMessage);
                validSize = false;
            }
        }
    }

    public  void checkout(){
        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();

        buildPizza(director, builder);

        switch (pizzaSize){
            case 1:
                builder.setSize(30);
                break;
            case 2:
                builder.setSize(35);
                break;
            case 3:
                builder.setSize(40);
        }

        Pizza pizza = builder.build();
        System.out.println(pizza.toString());
    }

    public void buildPizza(Director director, PizzaBuilder builder){
        switch (pizzaNum){
            case 1:
                director.buildMargherita(builder);
                break;
            case 2:
                director.buildPepperoni(builder);
                break;
            case 3:
                director.buildHawaiian(builder);
                break;
            case 4:
                director.buildFunghi(builder);
                break;
            case 5:
                director.buildChicken(builder);
                break;
            case 10:
                buildCustomizedPizza(director, builder);
                break;
        }
    }
    public void buildCustomizedPizza(Director director, PizzaBuilder builder){
        director.buildCustomized(builder);
        while(!validIngredient){
            System.out.println("Please select your toppings for the customized pizza.\n" +
                    "1. Pepperoni\n" +
                    "2. Pineapple\n" +
                    "3. Mushroom\n" +
                    "4. Chicken\n" +
                    "5. Tuna\n" +
                    "10 Done!");
            try{
                String input = scanner.nextLine();
                int ingredientNum = Integer.parseInt(input);
                if(ingredientNum == 10){
                    validIngredient = true;
                }else if(ingredientNum > 0 && ingredientNum <= 5){
                    switch (ingredientNum){
                        case 1:
                            builder.setHasPepperoni(true);
                            break;
                        case 2:
                            builder.setHasPineapple(true);
                            break;
                        case 3:
                            builder.setHasMushroom(true);
                            break;
                        case 4:
                            builder.setHasChicken(true);
                            break;
                        case 5:
                            builder.setHasTuna(true);
                            break;
                    }
                }else{
                    System.out.println(errorMessage);
                }
            }catch (Exception e){
                System.out.println(errorMessage);
                validIngredient = false;
            }
        }

    }
    public void test(){
        Director director = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        director.buildFunghi(pizzaBuilder);
        pizzaBuilder.setSize(30);
        Pizza funghi = pizzaBuilder.build();

        System.out.println(funghi.toString());
    }
}
