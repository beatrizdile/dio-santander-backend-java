public class TernaryCondition {
    public static void main(String[] args) {
        int grade = 7;

        String res = grade>=7? "Approved" : "Reproved";
        System.out.println("First: " + res);


        grade = 5;
        res = grade>=7? "Approved" : grade>=5 && grade<=7 ? "Retake Test" : "Reproved";
        System.out.println("Second: " + res);
    }
}
