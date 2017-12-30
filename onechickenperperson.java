// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class onechickenperperson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if(n > m) {
            if(n - m == 1) {
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + (n - m) + " pieces of chicken left over!");
            }
        } else if(n < m) {
            if(m - n == 1) {
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + (m - n) + " more pieces of chicken!");
            }
        } else {
            return;
        }
    }
}
