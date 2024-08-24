package abstactAndInterface.abstractOne;

abstract class Animal {
    void bark() {};
}

class Cat extends Animal {
    @Override
    void bark() {
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Bow Bow");
        int result = (int) (10 / 3);
        System.out.println(result);
    }
}


public class AbstractRunner {
    public static void main(String[] args) {

        Animal [] animals = {new Dog(), new Cat()};

        for(Animal el : animals) {
            el.bark();
        }
    }
}
