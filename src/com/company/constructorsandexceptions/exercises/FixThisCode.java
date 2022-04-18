package com.company.constructorsandexceptions.exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixThisCode {
    public static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.append(text + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path:");
        String filePath = scanner.nextLine();
        System.out.println("How many times to print?:");
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        System.out.println("what text to add?:");
        String textToAdd = scanner.next();
        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
    }
}
