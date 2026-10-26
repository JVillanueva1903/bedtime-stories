package com.pluralsight;

public class bedtimestories {
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StoryReader {
    public static void main(String[] args) {
        Scanner scanner = newScanner(System.in);

        // Prompt user for the story filename
        System.out.println("Enter the name of the story file to read:");
        System.out.println("Options: goldilocks.txt, hansel_and_gretel.txt, mary_had_a_little_lamb.txt");
        String filename = scanner.nextLine();

        // Try to read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;

            while (!(null == (line = reader.readLine()))) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error reading the file. Make sure the filename is correct.");
        }
    }

    public static Scanner newScanner(java.lang.Object in) {
        return new Scanner(in);
    }

    private static class String {
    }

    private static class Scanner {
        private Scanner(java.lang.Object in) {

        }

        public String nextLine() {

        }
    }

    public static class System {
        public static java.lang.Object in;
        public static java.lang.Object out;
    }

    private static class IOException {
    }

    private static class BufferedReader {
        public BufferedReader(FileReader fileReader) {
        }

        public String readLine() {
            return null;
        }
    }

    private static class FileReader {
        public FileReader(String filename) {
        }
    }
}