public class Main {
    public static void main(String[] args) {
        Kaprekar kaprekar = new Kaprekar(3524);
        System.out.println("1. \nOriginal number: " + kaprekar.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar.getCounter() + " iterations.");
        System.out.println("Actual answer: 3");

        Kaprekar kaprekar2 = new Kaprekar(6621);
        System.out.println("\n\n2. \nOriginal number: " + kaprekar2.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar2.getCounter() + " iterations.");
        System.out.println("Actual answer: 5");

        Kaprekar kaprekar3 = new Kaprekar(6554);
        System.out.println("\n\n3. \nOriginal number: " + kaprekar3.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar3.getCounter() + " iterations.");
        System.out.println("Actual answer: 4");

        Kaprekar kaprekar4 = new Kaprekar(1234);
        System.out.println("\n\n4. \nOriginal number: " + kaprekar4.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar4.getCounter() + " iterations.");
        System.out.println("Actual answer: 3");

        Kaprekar kaprekar5 = new Kaprekar(495);
        System.out.println("\n\n5. \nOriginal number: " + kaprekar5.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar5.getCounter() + " iterations.");
        System.out.println("Actual answer: 4");

        Kaprekar kaprekar6 = new Kaprekar(495);
        System.out.println("\n\n6. \nOriginal number: " + kaprekar6.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar6.getCounter() + " iterations.");
        System.out.println("Actual answer: 4");

        Kaprekar kaprekar7 = new Kaprekar(10);
        System.out.println("\n\n7. \nOriginal number: " + kaprekar7.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar7.getCounter() + " iterations.");
        System.out.println("Actual answer: 5");

        Kaprekar kaprekar8 = new Kaprekar(2222);
        System.out.println("\n\n8. \nOriginal number: " + kaprekar8.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar8.getCounter() + " iterations.");
        System.out.println("Actual answer: 0");

        Kaprekar kaprekar9 = new Kaprekar(-3524);
        System.out.println("\n\n9. \nOriginal number: " + kaprekar9.getOriginal());
        System.out.println("Kaprekar constant reached in " + kaprekar9.getCounter() + " iterations.");
        System.out.println("Actual answer: 3");
    }
}
