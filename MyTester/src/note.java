public class note {
    public static void main (String[] args) {
        note n = new note();
//      pass argument
//        n.printTheMessage("Test");
//        n.printTheMessage("Another test");
//        System.out.println(n.returnTheMessage());
//        System.out.println(n.returnTheInteger());
        System.out.println("The result is " + n.calculateTheNumbers(2,5));

    }

//    Void doesn't return anything or any value.
    public void printSomething() {
        System.out.println("Printed from method");
        System.out.println("Printed from method2");
        System.out.println("Printed from method3");
    }

//    String message is argument. This is method that we can reuse.
    public void printTheMessage(String message) {
        System.out.println(message);
    }

    public String returnTheMessage() {
        return "Returning the string";
    }

    public int returnTheInteger() {
        return 23;
    }

    public int calculateTheNumbers(int a, int b) {
        return a + b;

    }
}
