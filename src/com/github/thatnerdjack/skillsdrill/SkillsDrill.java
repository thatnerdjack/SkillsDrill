package com.github.thatnerdjack.skillsdrill;

/**
 * Created by block7 on 11/17/14.
 */
public class SkillsDrill {

    public static final String VOWELS = "aeiou";
    public static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";

    public static void factorial(int input) {
        int total = 1;
        for(int i = 1; i <= input; i++) {
            total *= i;
        }
        System.out.println(total);
    }

    public static void stripNonLetters(String input) {
        String returnString = "";
        for (Character c : input.toLowerCase().toCharArray()) {
            if (Character.isLowerCase(c) || c.equals(' ')) {
                returnString += c;
            }
        }
        System.out.println(returnString);
    }

    public static int randomInt(int max) {
        return (int)(Math.random()*max + 1);
    }

    public static int[] arrayFill(int size, int max) {
        int[] returnArray = new int[size];
        for (int i = 0; i < size; i++) {
            returnArray[i] = randomInt(max);
        }
        return returnArray;
    }

    public static void printArray(int[] a) {
        String returnString = "";
        for (int i = 0; i < a.length; i++) {
            returnString += a[i] + " ";
        }
        System.out.println(returnString);
    }

    public static void findMaxInArray(int[] a) {
        int currentMax = -1;
        for (int i = 0; i < a.length; i++) {
            if (currentMax < a[i]) {
                currentMax = a[i];
            }
        }
        System.out.println(currentMax);
    }

    public static void randomWord() {
        String returnString = "";

    }

    public static void main(String args[]) {
        factorial(4);
        stripNonLetters("You can't always get what you want, buddy!!");
        int[] filledArray = arrayFill(10, 50);
        printArray(filledArray);
        findMaxInArray(filledArray);
    }

}
