import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Insert your name");
            String name = scanner.next();

            System.out.println("Insert your last name");
            String lastName = scanner.next();

            System.out.println("Insert your age");
            int age = scanner.nextInt();

            System.out.println("Insert your height");
            double height = scanner.nextDouble();

            System.out.println("Hi, my name is " + name + " " + lastName);
            System.out.println("I'm " + age + " years old");
            System.out.println("My height is " + height);
        }catch (InputMismatchException e){
            System.out.println("Non-numeric data has been inserted.");
        }
    }
}
