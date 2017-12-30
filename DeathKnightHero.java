// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class DeathKnightHero {
    private static boolean didWin(String s) {

        if(s.contains("CD")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            if(didWin(s)) { count++; }
        }

        System.out.println(count);

    }
}
