// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class peragrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int sigma = 0;

        for(char ch : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            int count = 0;
            for(char ch1 : s.toCharArray()) if(ch1 == ch) count++;
            if(count % 2 != 0) sigma++;
        }

        System.out.println(sigma == 0 ? 0 : sigma-1);
    }
}
