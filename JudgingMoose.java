// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int mx = Math.max(side1, side2);

        if(side1 == 0 && side2 == 0) {
            System.out.println("Not a moose");
            return;
        }

        if(side1 != side2) {
            System.out.println("Odd " + (mx * 2));
        } else {
            System.out.println("Even " + (mx * 2));
        }

    }
}
