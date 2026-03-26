import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        // Add bogies dynamically
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Check if Sleeper bogie exists
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train consist.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Print final list state
        System.out.println("Final train consist: " + trainConsist);
    }
}