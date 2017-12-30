// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        double total = (double) s.length();
        double whitespace = 0.0, lowercase = 0.0, uppercase = 0.0, symbols = 0.0;

        for(char ch : s.toCharArray()) {
            if(ch == '_') {
                whitespace++;
            } else if(Character.isLowerCase(ch) && Character.isAlphabetic(ch)) {
                lowercase++;
            } else if(Character.isUpperCase(ch) && Character.isAlphabetic(ch)) {
                uppercase++;
            } else {
                symbols++;
            }
        }

        System.out.println(whitespace/total);
        System.out.println(lowercase/total);
        System.out.println(uppercase/total);
        System.out.println(symbols/total);
    }
}
