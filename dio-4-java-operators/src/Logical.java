public class Logical {
    public static void main(String[] args) {
        boolean var1 = true;
        boolean var2 = false;

        if (var1 && var2) {
            System.out.println("Both are true.");
        }
        if (var1 || var2) {
            System.out.println("One is true.");
        }
        if (1 > 0) {
            System.out.println("1 greater than 0.");
        }

        System.out.println("End.");
    }
}
