// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class sevenwonders {
    static int min2(int a, int b) {
        if(a < b) {
            return a;
        }

        return b;
    }

    static int min3(int a, int b, int c) {
        return min2(min2(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int t = 0, c = 0, g = 0;
        int sigma;

        for(char ch : s.toCharArray()) {
            if(ch == 'T') { t++; }
            if(ch == 'C') { c++; }
            if(ch == 'G') { g++; }
        }

        sigma = t * t + c * c + g * g;
        sigma += min3(t, c, g) * 7;

        System.out.println(sigma);
    }
}
