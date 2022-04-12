package com.company.datastructures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write
        int[] myArray = {2, 5, 7, 3};

        Arrays.sort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
}
