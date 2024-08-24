package abstractClass;

abstract public class AbstractRecipe {
    public void excute () {
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
