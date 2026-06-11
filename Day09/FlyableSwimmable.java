package Day09;

interface Flyable {
    void fly();

    default void glide(){
        System.out.println("Gliding through air!");
    }
}

interface Swimmable {
    void swim();
}

class Bird {
    String name;

    Bird(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name + " is eating!");
    }
}

class Duck extends Bird implements Flyable, Swimmable {

    Duck(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying!");
    }

    @Override
    public void swim(){
        System.out.println(name + " is swimming!");
    }
}

class Penguin extends Bird implements Swimmable {

    Penguin(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(name + " is swimming!");
    }
}

public class FlyableSwimmable {
    public static void main(String[] args){

        Duck duck = new Duck("Donald");
        Penguin penguin = new Penguin("Pingu");

        System.out.println("=== Duck ===");
        duck.eat();
        duck.fly();
        duck.swim();
        duck.glide();

        System.out.println("\n=== Penguin ===");
        penguin.eat();
        penguin.swim();

        System.out.println("\n=== Polymorphism ===");
        Flyable[] flyers = {duck};
        for(Flyable f : flyers)
            f.fly();

        Swimmable[] swimmers = {duck, penguin};
        for(Swimmable s : swimmers)
            s.swim();

        // Penguin cannot fly!
        // penguin.fly(); ← compile error! ✅
        System.out.println("\nPenguin cannot fly! ✅");
    }
}