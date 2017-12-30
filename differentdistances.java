// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class differentdistances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextDouble()) {
            double x1 = scanner.nextDouble();
            if(x1 == 0) break;
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double p = scanner.nextDouble();

            double p_recip = 1 / p;

            double first_summand = Math.pow(Math.abs(x1 - x2), p);
            double second_summand = Math.pow(Math.abs(y1 - y2), p);

            double result = Math.pow((first_summand + second_summand), p_recip);

            System.out.println(result);
        }
    }
}
