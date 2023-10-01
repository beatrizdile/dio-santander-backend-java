public class Concatenation {
    public static void main(String[] args) {
        String concat = "?";
        concat = 1+1+1+"1";  // concat = 31
        System.out.println(concat);
        concat = 1+"1"+1+1; // concat = 1111
        System.out.println(concat);
        concat = 1+"1"+1+"1"; // concat = 1111
        System.out.println(concat);
        concat = "1"+1+1+1; // concat = 1111
        System.out.println(concat);
        concat = "1"+(1+1+1); // concat = 13
        System.out.println(concat);
    }
}
