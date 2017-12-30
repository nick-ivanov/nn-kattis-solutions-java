// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class identifyingmaptiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int x = 0, y = 0;
        int factor = 1 << (s.length() - 1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                x += factor;
            }
            if (s.charAt(i) == '2') {
                y += factor;
            }
            if (s.charAt(i) == '3') {
                x += factor;
                y += factor;
            }

            factor /= 2;
        }

        System.out.printf("%d %d %d\n", s.length(), x, y);
    }
}