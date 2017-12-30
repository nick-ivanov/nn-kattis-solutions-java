// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class arealchallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        double P = 4.0 * Math.sqrt(S);

        System.out.println(P);
    }
}
