// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            double c = Math.sqrt((double)(h*h) + (double)(w*w));
            if((double) m <= c) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
