public class SimpleConditional {
    public static void main(String[] args) {
        double balance = 25.0;
        double solicitedMoney = 22.0;

        if(solicitedMoney < balance)
            balance = balance - solicitedMoney;

        System.out.println(balance);
    }
}
