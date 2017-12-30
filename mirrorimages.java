// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class mirrorimages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int r, c;

        for(int i = 0; i < t; i++) {
            ArrayList<String> matrix = new ArrayList();
            r = scanner.nextInt();
            c = scanner.nextInt();

            for(int j = 0; j < r; j++) {
                matrix.add(0, scanner.next());
            }

            System.out.println("Test " + (i + 1));

            for(int j = 0; j < r; j++) {
                for(int k = 0; k < c; k++) {
                    System.out.print(matrix.get(j).charAt(c-k-1));
                }
                System.out.println();
            }
        }
    }
}
