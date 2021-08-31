package no.kristiania;

import java.util.Scanner;

public class RomanNumber {

    public static void main(String[] args) {
        System.out.println("Which number do you want?");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d in roman notation is %s", number, toRoman(number));

    }

    /*
        public static String toRoman(int number) {

            if(number == 3) {
                return "III";
                }
            if(number == 2) {
                return "II";
            }
            return "II";
        }

     */
    public static String toRoman(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
            return result;
    }
}

