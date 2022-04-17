package com.company.methodsexercises;

public class StringMiddle {

    public static void main(String[] args) {
        String myString = new String("1234567");
        int middle;

        if (myString.length() % 2 == 0) {
            middle = myString.length() / 2;
            System.out.println(myString.charAt(middle - 1));
            System.out.println(myString.charAt(middle));
        } else {
            middle = myString.length() / 2;
            System.out.println(myString.charAt(middle));
        }

        String str = new String("My New String is here!");
        System.out.println(countWords(str));

    }

    public static int countWords(String str) {
        int count = 0;
        // iterate over string length
        for (int i = 0; i < str.length(); i++) {
            // if char from length is different than a space add +1 to a counter.
            if (str.charAt(i) != ' ') {
                count++;
                //while the chars are different from a space increment i to match the number of letters in the current word.
                while (str.charAt(i) != ' ' && i < str.length() - 1) {
                    i++;
                }
            }
        }
        return count;
    }
}
