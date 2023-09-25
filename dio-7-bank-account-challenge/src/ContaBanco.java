import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Insert your account number: ");
        conta.number = scanner.nextInt();
        System.out.println("Insert your agency: ");
        conta.agency = scanner.next();
        System.out.println("Insert your name: ");
        conta.clientName = scanner.next();
        System.out.println("Insert your money: ");
        conta.balance = scanner.nextDouble();

        System.out.println("Hello " + conta.clientName + " thank you for creating an account in our bank, your agency is "
                + conta.agency + ", your account number is " + conta.number + " and your balance is " + conta.balance);
    }
}
