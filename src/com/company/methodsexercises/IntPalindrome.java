package com.company.methodsexercises;

public class IntPalindrome {

    static int myInt = 123321;

    public static void main(String[] args) {
        System.out.println(isPalindrome(myInt));
    }


    static boolean isPalindrome(int myNumber) {

        String myString = String.valueOf(myNumber);

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = myString.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (myString.charAt(i) != myString.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }
}
