// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>
// Problem solution for Kattis.com

import java.util.Scanner;

public class soylent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcases = scanner.nextInt();
        int n, numberOfBottles = 0;

        for(int i = 0; i < testcases; i++) {
            n = scanner.nextInt();

            if(n % 400 == 0) {
                numberOfBottles = n / 400;
            } else {
                numberOfBottles = n / 400 + 1;
            }

            System.out.println(numberOfBottles);
        }
    }
}
