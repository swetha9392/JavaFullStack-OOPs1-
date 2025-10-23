
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        /*Dog d = new Dog();
        Animal a = d; // Upcasting
        a.eat();      // Works
        // a.bark();  // Error: Animal reference can't call Dog methods*/


        Animal a = new Dog(); // Upcasting
      Dog d = (Dog) a;      // Downcasting
        d.bark();             // Works now

    }
}
\