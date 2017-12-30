// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int k = scanner.nextInt();

            double sigma = 0.5;

            for(int j = 0; j < k; j++) {
                sigma = sigma * 2.0 + 0.5;
            }

            sigma -= 0.5;

            System.out.println((int) sigma);
        }
    }
}
