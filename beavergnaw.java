// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class beavergnaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int D = scanner.nextInt();
            int V = scanner.nextInt();
            if(D == 0 && V == 0) break;

            double d = Math.pow(D*D*D - ((6.0 * V) / Math.PI), 1.0/3.0);

            System.out.printf("%.9f\n", d);
        }
    }
}
