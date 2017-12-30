// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class sodaslurper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int bp = e + f; // buying power
        int count = 0;

        while(bp >= c) {
            int bottles = bp / c;
            count += bottles;
            bp = (bp - c * bottles) + bottles;
        }

        System.out.println(count);
    }
}
