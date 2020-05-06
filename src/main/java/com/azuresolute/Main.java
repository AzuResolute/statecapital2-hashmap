package com.azuresolute;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            writeFile();
            readFile();
        } catch(IOException ex) {
            System.out.println("what went wrong?");
        }

    }

    public static void writeFile()  throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        out.println("Katrina");
        out.println("Danielle");
        out.println("Josel");

        // these lines have not been entered into the file yet
        // ^ flush forces everything that is still pending to be written

        // all three files have been written into the file
        out.flush();

        out.close();

    }

    public static void readFile() throws IOException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));

        while(scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            System.out.println(currentLine);
        }
    }
}
