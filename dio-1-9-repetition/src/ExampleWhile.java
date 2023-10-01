import java.util.concurrent.ThreadLocalRandom;
public class ExampleWhile {
    public static void main(String[] args) {
        double money = 50.0;
        while (money > 0) {
            double cost = ThreadLocalRandom.current().nextDouble(2, 8);
            if (cost > money)
                cost = money;
            System.out.println("Cost: " + cost);
            money = money - cost;
        }
        System.out.println("Money: " + money);
    }
}
