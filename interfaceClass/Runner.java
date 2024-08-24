package interfaceClass;

public class Runner {

    public static void main(String[] args) {
//        GamingConsoleImple gamingConsoleImple = new GamingConsoleImple();
//        gamingConsoleImple.up();
//        gamingConsoleImple.down();
//        gamingConsoleImple.left();
//        gamingConsoleImple.right();

        DummyAlgorithm algorithm = new DummyAlgorithm();
        int result  = algorithm.complexAlgorithm(10,20);

        RealAlgorithm algorithm2 = new RealAlgorithm();
        result = algorithm2.complexAlgorithm(10,20);
        System.out.println(result);
    }
}
