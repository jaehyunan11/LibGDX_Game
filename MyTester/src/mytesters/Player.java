package mytesters;

public class Player {

    public int health = 100;
    public int power = 50;
    public String name = "Warrior";

//    Constructor
    public Player(int health, int power, String name) {
        this.health = health;
        this.power = power;
        this.name = name;
    }

    public void playerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);

    }
}
