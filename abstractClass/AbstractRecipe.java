package abstractClass;

public abstract class AbstractRecipe {
    public void excute () {
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
