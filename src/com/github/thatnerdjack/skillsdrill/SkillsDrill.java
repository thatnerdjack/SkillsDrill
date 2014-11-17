package com.github.thatnerdjack.skillsdrill;

/**
 * Created by block7 on 11/17/14.
 */
public class SkillsDrill {

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

    public static void main(String args[]) {
        factorial(4);
        stripNonLetters("You can't always get what you want, buddy!!");
    }

}
