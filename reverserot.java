// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class reverserot {
    final static String doubleAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            int n = scanner.nextInt();
            if(n == 0) break;
            String s = scanner.next();

            String result = "";
            for(int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                int index = doubleAlphabet.indexOf(ch);
                result += doubleAlphabet.charAt(index + n);
            }

            System.out.println(result);
        }
    }
}
