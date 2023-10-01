import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) {
        String[] selected;

        selected = selectCandidates();
        printSelected(selected);
        for(String candidate: selected)
            callCandidate(candidate);
    }

    static void callCandidate(String candidate){
        int trys = 1;
        boolean keepTrying = true;
        boolean pickedUp = false;
        do{
            pickedUp = pickUpCall();
            keepTrying = !pickedUp;
            if(keepTrying)
                trys++;
            else
                System.out.println("SUCCESSFUL CONTACT WITH " + candidate + " IN " + trys + "° TRY");
        }while(keepTrying && trys<=3);
    }
    static boolean pickUpCall(){
        return new Random().nextInt(3)==1;
    }
    static void printSelected(String[] candidates){
        System.out.println("Printing a list of candidates with element index:");
        for(int i=0; i<candidates.length; i++)
            System.out.println("The candidate of n° " + (i+1) + " is " + candidates[i]);

//        for(String candidate: candidates)
//            System.out.println("The selected candidate was " + candidate);
    }
    static String[] selectCandidates(){
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        List<String> selected = new ArrayList<>();
        int candidatesSelected = 0;
        int currentCandidate = 0;
        double baseWage = 2000.0;
        while(candidatesSelected < 5 && currentCandidate < candidates.length){
            String candidate = candidates[currentCandidate];
            double intendedWage = intendedWage();
            System.out.println("The candidate " + candidate + " Solicited this wage: " + intendedWage);
            if(baseWage >= intendedWage){
                System.out.println("The candidate " + candidate + " was selected");
                selected.add(candidate);
                candidatesSelected++;
            }
            currentCandidate++;
        }
        return selected.toArray(String[]::new);
    }

    static double intendedWage(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

//    static void analyzeCandidate(double wage){
//        double baseWage = 2000.0;
//        if(baseWage > wage)
//            System.out.println("CALL CANDIDATE");
//        else if(baseWage==wage)
//            System.out.println("CALL CANDIDATE WITH PROPOSAL");
//        else
//            System.out.println("WAIT FOR OTHER CANDIDATES");
//    }
}
