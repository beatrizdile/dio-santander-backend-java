public class ExampleForArr {
    public static void main(String[] args) {
        String students[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x=0; x < students.length; x++){
            System.out.println("The " + x + " student is " + students[x]);
        }
        // For Each
        for(String student : students){
            System.out.println("Name: " + student);
        }
    }
}
