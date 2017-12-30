// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class EncodedMessage {

    private static String transpose(String s) {
        String result = "";

        int n = (int) Math.sqrt(s.length());

        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < n; j++) {
                System.out.print(s.charAt(j*n + i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            System.out.println(transpose(s));
        }

    }
}
