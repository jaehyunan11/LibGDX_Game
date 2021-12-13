package mytesters;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
//        Player p1 = new Player(100, 80, "Warrior");
//        p1.playerInfo();
//        System.out.println();
//        Player p2 = new Player(150, 100, "Dragon");
//        p2.playerInfo();
//        System.out.println();
//        Player p3 = new Player(160, 110,"Knight");
//        p3.playerInfo();
//        System.out.println();

//        Player p4 = new Player(50,50, "Elf");
//
//        p4.setHealth(56);
//
//        System.out.println("The Health is " + p4.getHealth());
//
//        p4.setPower(100);
//
//        System.out.println("The Power is " + p4.getPower());
//
//        p4.setName("Robot");
//
//        System.out.println("The name is " + p4.getName());
//
//        p4.playerInfo();

//        Provide argument
        Warrior w = new Warrior(100, 50, "Warrior");

        w.playerInfo();

        System.out.println();

        w.setHealth(12);
        w.setPower(45);
        w.setName("Carl");

//        System.out.println("The health of the warrior is " + w.getName());
//        System.out.println("The health of the warrior is " + w.getPower());
//        System.out.println("The health of the warrior is " + w.getHealth());

        w.playerInfo();

        w.move();
        w.attack();

        Archer a = new Archer();

        a.move();
        a.attack();

//        ArrayList can be resizable but regular Array cannot.
        ArrayList<String> stringArray = new ArrayList<String> ();
        ArrayList<Warrior> warriorArray = new ArrayList<Warrior> ();

//        for(int i = 0; i < 10; i++) {
//            stringArray.add("New " + i);
//        }
//
//        for(String name: stringArray) {
//            System.out.println(name);
//
//        }

    }
}
