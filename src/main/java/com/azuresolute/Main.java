package com.azuresolute;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
//            writeFile();
            readFile();
        } catch(IOException ex) {
            System.out.println("what went wrong?");
        }

    }

    public static void writeFile()  throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        out.println("this is a line in my file...");
        out.println("a second line in my file...");
        out.println("a third line in my file...");
        out.flush();
        out.close();
    }

    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("outFile.txt"));
        Scanner scanner = new Scanner(reader);

        while(scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            System.out.println(currentLine);
        }
    }
}
