package Viikko3.singleton_design_patterns;

import java.io.*;
public class Logger {

    // The single instance of Logger (Singleton)
    private static Logger instance = null;
    private BufferedWriter writer;
    private String fileName;

    // Private constructor to prevent external instantiation
    private Logger() {
        try {
            // Default log file name
            fileName = "default_log.txt";
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.err.println("Error initializing log file: " + e.getMessage());
        }
    }

    // Method to return the single instance (Singleton)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to dynamically set the file name
    public void setFileName(String newFileName) {
        try {
            // Close the current file if open
            if (writer != null) {
                writer.close();
            }

            // Set the new file name and open a new file for logging
            fileName = newFileName;
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.err.println("Error setting log file: " + e.getMessage());
        }
    }

    // Method to write log messages
    public void write(String message) {
        try {
            writer.write(message);
            writer.newLine();  // Write each message on a new line
            writer.flush();    // Ensure it's written immediately
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    // Method to close the logger
    public void close() {
        try {
            if (writer != null) {
                writer.close();
                System.out.println("Log file closed.");
            }
        } catch (IOException e) {
            System.err.println("Error closing the log file: " + e.getMessage());
        }
    }
}

