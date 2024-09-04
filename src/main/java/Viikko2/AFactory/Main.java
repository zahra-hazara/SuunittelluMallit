package Viikko2.AFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIFactory factory;

        // Ask the user to choose style A or B
        System.out.println("Choose a style: 'A' or 'B'");
        String choice = scanner.nextLine().trim().toUpperCase();

        // Select the appropriate factory
        if (choice.equals("A")) {
            factory = new AFactory();
        } else {
            factory = new BFactory();
        }

        // Create UI elements using the chosen factory
        Button button = factory.createButton("Click Me");
        TextField textField = factory.createTextField("Enter text");
        Checkbox checkbox = factory.createCheckbox("Accept Terms");

        // Display the UI elements
        button.display();
        textField.display();
        checkbox.display();

        // Modify the UI elements
        button.setText("Updated Button");
        textField.setText("Updated Text");
        checkbox.toggle(); // Check the checkbox

        // Display the updated UI elements
        System.out.println("\nUpdated UI Elements:");
        button.display();
        textField.display();
        checkbox.display();

        scanner.close();
    }
}
