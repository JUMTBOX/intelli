package abstractClass;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe1 = new Recipe1();
        recipe1.excute();

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.excute();
    }
}
