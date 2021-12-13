package mytesters;

// Player is super class or parent class
public class Warrior extends Player implements Actions{

    public Warrior(int health, int power, String name) {
//        super keywords can invoke constructors and their argument from parent's class
        super(health, power, name);
    }

    @Override
    public void playerInfo() {
        System.out.println("The Power is " + getPower());
    }

    @Override
    public void move() {
        System.out.println("The Warrior is moving");

    }

    @Override
    public void attack() {
        System.out.println("The Warrior is attaking");

    }
} //Warrior
