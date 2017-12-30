// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class herman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        double euclid_area = Math.PI * r * r;
        System.out.printf("%.6f\n", euclid_area);

        double taxicab_area = 2 * r * r;
        System.out.printf("%.6f\n", taxicab_area);
    }
}
