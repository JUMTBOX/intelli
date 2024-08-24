package abstactAndInterface.interfaceOne;

interface Flyable {

    public void fly ();
}

 class Bird implements Flyable {
    @Override
    public void fly(){
        System.out.println("with wings");
    };
}

class AeroPlane implements Flyable {

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable [] flyables = {new AeroPlane(), new Bird()};

        for(Flyable el : flyables) {
            el.fly();
        }
    }
}