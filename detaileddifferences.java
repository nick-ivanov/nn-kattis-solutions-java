// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_cases = scanner.nextInt();

        for(int i = 0; i < n_cases; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();


            System.out.println(s1);
            System.out.println(s2);

            for(int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) == s2.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
            System.out.println();
        }
    }
}
