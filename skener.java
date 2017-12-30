// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>
// Problem solution for Kattis.com

import java.util.Scanner;

public class skener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int zr = scanner.nextInt();
        int zc = scanner.nextInt();

        String s;

        for(int i = 0; i < r; i++) {
            s = scanner.next();

            for(int j = 0; j < zr; j++) {
                for (char ch : s.toCharArray()) {
                    for (int k = 0; k < zc; k++) {
                        System.out.print(ch);
                    }
                }
                System.out.println();
            }
        }
    }
}
