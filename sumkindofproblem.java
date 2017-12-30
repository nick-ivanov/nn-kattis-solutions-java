// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class sumkindofproblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        for(int i = 0; i < p; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            long s1 = 0, s2 = 0, s3 = 0;

            s1 = n * (n+1) / 2;
            s2 = n * n;
            s3 = n * (n+1);

            System.out.println("" + k + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
