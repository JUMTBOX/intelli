package abstractClass;

public class RecipeWithMicrowave extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the raw Material");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean up the Utensils");
        System.out.println("Switch off the microwave");
    }
}
