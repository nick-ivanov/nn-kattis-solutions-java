// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int quadrant = 0;

        if(x > 0 && y > 0) {
            quadrant = 1;
        } else if(x < 0 && y > 0) {
            quadrant = 2;
        } else if(x < 0 && y < 0) {
            quadrant = 3;
        } else if(x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0;
        }

        System.out.println(quadrant);
    }
}
