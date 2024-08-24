package abstractClass;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the raw Material");
        System.out.println("Get the Utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");

    }

    @Override
    void cleanUp() {
        System.out.println("Clean up the Utensils");
    }
}
