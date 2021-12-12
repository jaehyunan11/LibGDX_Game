package mytesters;

public class Tester {

    public static void main(String[] args) {
        Player p1 = new Player(100, 80, "Warrior");
        p1.playerInfo();
        System.out.println();
        Player p2 = new Player(150, 100, "Dragon");
        p2.playerInfo();
        System.out.println();
        Player p3 = new Player(160, 110,"Knight");
        p3.playerInfo();
        System.out.println();

    }
}
