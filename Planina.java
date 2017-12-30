// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int A = (int) Math.pow(2, n) + 1;
        int points = A * A;

        System.out.println(points);
    }
}
