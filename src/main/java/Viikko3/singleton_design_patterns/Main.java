package Viikko3.singleton_design_patterns;

public class Main {
    public static void main(String[] args) {
        Logger  logger = Logger.getInstance();

        // Writing to the default log file
        logger.write("Starting the application...");
        logger.write("Loading resources...");

        // Changing the log file dynamically
        logger.setFileName("new_log.txt");
        logger.write("Switched to new log file.");
        logger.write("Performing task...");
        logger.write("Task completed.");

        // Always close the logger when done
        logger.close();
    }
}
