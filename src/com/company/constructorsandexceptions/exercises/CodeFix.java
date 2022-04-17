package com.company.constructorsandexceptions.exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeFix {

    public static void main(String[] args) throws IOException {
        String data = "This is the data in the output file";

        // Creates a FileWriter
        FileWriter output = new FileWriter("output.txt");

        // Writes the string to the file
        output.write(data);

        // Closes the writer
        output.close();

    }
}


