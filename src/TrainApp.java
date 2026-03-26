import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC4 - LinkedList) ===");

        // Initialize Train Consist as a LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");  // index 2 = 3rd position

        // Remove first and last bogies
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final train consist
        System.out.println("Final train consist after insertion/removal: " + trainConsist);
    }
}