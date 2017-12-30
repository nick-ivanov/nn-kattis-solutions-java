// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class parking {
    public static int min2(int a, int b) {
        return a < b ? a : b;
    }

    public static int min3(int a, int b, int c) {
        return min2(min2(a, b), c);
    }

    public static int max2(int a, int b) {
        return a > b ? a : b;
    }

    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int t1s = scanner.nextInt();
        int t1e = scanner.nextInt();
        int t2s = scanner.nextInt();
        int t2e = scanner.nextInt();
        int t3s = scanner.nextInt();
        int t3e = scanner.nextInt();

        int mn = min3(t1s, t2s, t3s);
        int mx = max3(t1e, t2e, t3e);
        int sigma = 0;

        for(int i = mn; i < mx; i++) {
            int acc = 0;
            if(i >= t1s && i <= t1e - 1) acc++;
            if(i >= t2s && i <= t2e - 1) acc++;
            if(i >= t3s && i <= t3e - 1) acc++;

            if(acc == 1) sigma += a;
            if(acc == 2) sigma += 2 * b;
            if(acc == 3) sigma += 3 * c;
        }

        System.out.println(sigma);
    }
}
