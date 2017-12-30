// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class ptice {
    static int max2(int a, int b) {
        return a > b ? a : b;
    }

    static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        String adrianSequence = "ABC";
        String brunoSequence = "BABC";
        String goranSequence = "CCAABB";

        int ai = 0, bi = 0, gi = 0;
        int adrianSum = 0, brunoSum = 0, goranSum = 0;

        for(char ch : s.toCharArray()) {
            adrianSum = adrianSequence.charAt(ai) == ch ? adrianSum + 1 : adrianSum;
            brunoSum = brunoSequence.charAt(bi) == ch ? brunoSum + 1 : brunoSum;
            goranSum = goranSequence.charAt(gi) == ch ? goranSum + 1 : goranSum;

            ai = ai == 2 ? 0 : ai+1;
            bi = bi == 3 ? 0 : bi+1;
            gi = gi == 5 ? 0 : gi+1;
        }

        int peak;
        System.out.println(peak = max3(adrianSum, brunoSum, goranSum));

        if(adrianSum == peak) System.out.println("Adrian");
        if(brunoSum == peak) System.out.println("Bruno");
        if(goranSum == peak) System.out.println("Goran");
    }
}
