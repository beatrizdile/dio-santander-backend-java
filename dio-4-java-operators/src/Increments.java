public class Increments {
    public static void main(String[] args) {
        int num = 5;
        num++;
        System.out.println(num);
        System.out.println(num++); // the increment happens after printing
        System.out.println(++num);

        boolean var = true;
        System.out.println(!var);
        System.out.println(var);
        var = !var;
        System.out.println(var);
    }
}
