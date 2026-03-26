import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3 - HashSet) ===");

        // Initialize Train Consist as a HashSet
        Set<String> trainConsist = new HashSet<>();

        // Add bogies, including duplicates
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Sleeper");  // duplicate
        trainConsist.add("AC");       // duplicate

        // Display the final set
        System.out.println("Final train consist (duplicates removed automatically): " + trainConsist);
    }
}