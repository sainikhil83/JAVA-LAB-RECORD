class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Interfaces for Multiple Inheritance
interface Pet {
    void pet();
}

interface Friendly {
    void friendly();
}

// Multiple Inheritance using interfaces
class SmartDog implements Pet, Friendly {
    public void pet() {
        System.out.println("SmartDog is a pet");
    }

    public void friendly() {
        System.out.println("SmartDog is friendly");
    }
}

// Hybrid Inheritance
class SmartPuppy extends Dog implements Pet {
    public void pet() {
        System.out.println("SmartPuppy is a pet");
    }

    void run() {
        System.out.println("SmartPuppy is running");
    }
}

public class inheritance {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\nMultiple Inheritance:");
        SmartDog sd = new SmartDog();
        sd.pet();
        sd.friendly();

        System.out.println("\nHybrid Inheritance:");
        SmartPuppy sp = new SmartPuppy();
        sp.eat();
        sp.bark();
        sp.pet();
        sp.run();
    }
}