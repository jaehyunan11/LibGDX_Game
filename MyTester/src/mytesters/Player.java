package mytesters;

public class Player {

    private int health;
    private int power;
    private String name;

//    Constructor
    public Player(int health, int power, String name) {
        this.health = health;
        this.power = power;
        this.name = name;
    }
//    Setter
    public void setHealth(int health) {
        this.health = health;

    }
//    Getter
    public int getHealth() {
        return this.health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void playerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);

    }

}
