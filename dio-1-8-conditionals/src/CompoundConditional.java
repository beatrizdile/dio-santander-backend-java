public class CompoundConditional {
    public static void main(String[] args) {
        double balance = 25.0;
        double solicitedMoney = 21.0;

        if(solicitedMoney < balance){
            balance = balance - solicitedMoney;
            System.out.println(balance);
        }
        else
            System.out.println("Not enough money.");
    }
}
