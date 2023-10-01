public class Relational {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        boolean res = num1 == num2;
        System.out.println("num1 is equal to num2? " + res);

        res = num1 != num2;
        System.out.println("num1 is different to num2? " + res);

        res = num1 > num2;
        System.out.println("num1 is greater than num2? " + res);

        res = num1 < num2;
        System.out.println("num1 is lower than num2? " + res);


        String name1 = "BEATRIZ";
        String name2 = "BEATRIZ";

        System.out.println(name1 == name2);

        String name3 = new String("BEATRIZ");
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

    }
}
