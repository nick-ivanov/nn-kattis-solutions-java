// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class estimatingtheareaofacircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            int m = scanner.nextInt();
            int c = scanner.nextInt();

            if(r == 0) break;

            double trueArea = Math.PI * r * r;
            double squareArea = 4 * r * r;
            double proportion = (double) c / (double) m;
            double estimatedArea = squareArea * proportion;

            System.out.printf("%f %f\n", trueArea, estimatedArea);
        }

    }
}
