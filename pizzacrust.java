// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class pizzacrust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        double inner_area = Math.PI * (r-c) * (r-c);
        double outer_area = Math.PI * r * r;

        double cheese_percentage = (inner_area / outer_area) * 100;

        if(cheese_percentage == 0.0) {
            System.out.println("0.000000000");
        } else {
            System.out.printf("%.6f\n", cheese_percentage);
        }
    }
}
