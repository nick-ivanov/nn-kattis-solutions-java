// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class skocimis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;

        while(true) {
            if(c - b > b - a) {
                if (c - b > 1) {
                    int tmp = b + 1;
                    a = b;
                    b = tmp;
                    count++;
                    continue;
                }
            } else {
                if(b - a > 1) {
                    int tmp = b - 1;
                    c = b;
                    b = tmp;
                    count++;
                    continue;
                }
            }

            break;
        }

        System.out.println(count);
    }
}
