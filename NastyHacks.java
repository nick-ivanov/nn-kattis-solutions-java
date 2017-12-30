// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();

            if(e - r > c) {
                System.out.println("advertise");
            } else if(e - r < c) {
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
        }

    }
}
