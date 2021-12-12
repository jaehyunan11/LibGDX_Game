import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        Random random = new Random();

        int [] data = new int[10];

        System.out.println("We have " + (data.length-1) + " is " + data[data.length-1]);

        System.out.println("The value of the element on index " + data.length + " is " + data[data.length-1]);

//        for(int i = 0; i < data.length; i++) {
//           data[i] = random.nextInt(100);
//
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println("The value fo the element on index " + i + " is " +data[i]);
//        }

    }
}
