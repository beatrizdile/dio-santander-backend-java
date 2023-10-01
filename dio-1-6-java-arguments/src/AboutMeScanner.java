import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insert your first name: ");
        String name = scanner.next();

        System.out.println("Insert your last name: ");
        String lastName = scanner.next();

        System.out.println("Insert your age: ");
        int age = scanner.nextInt();

        System.out.println("Insert your height: ");
        double height = scanner.nextDouble();

        System.out.println("Hi, my name is " + name + " " + lastName);
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + height);
    }
}
