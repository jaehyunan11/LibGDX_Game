package mytesters;

// We can inherit multiple implements.
public class Archer implements Actions {

    @Override
    public void move(){
        System.out.println("The ARCHER is MOVING");
    }

    @Override
    public void attack(){
        System.out.println("The ARCHER is ATTCKING");
    }
}
