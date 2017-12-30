// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class mixedfractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;

        while(true) {
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if(denominator == 0) break;

            System.out.println("" + numerator/denominator + " " + numerator%denominator + " / " + denominator);
        }
    }
}
