// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class Billiard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int s = scanner.nextInt();
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if(a == 0 && b == 0 && s == 0 && m == 0 && n == 0) {
                break;
            }

            double ratio = (double) b / (double) a;
            double tg = ((double) n * ratio) / (double) m;
            System.out.print(String.format("%.2f ", Math.atan(tg) * 180.0 / Math.PI));

            double stuff = Math.sqrt((double)(a * m) * (double) (a * m) +  (double)(b * n) * (double) (b * n)) / (double) s;
            System.out.println(String.format("%.2f", stuff));
        }
    }
}
