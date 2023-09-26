import java.util.Random;

public class ExampleDoWhile {
    public static void main(String[] args) {
        System.out.println("Ringing...");

        do{
            System.out.println("Phone ringing");
        }while(ringing());
        System.out.println("Hello?");
    }

    private static boolean ringing(){
        boolean pickedUp = new Random().nextInt(3)==1;
        System.out.println("Picked up? " + pickedUp);
        return ! pickedUp;
    }
}
