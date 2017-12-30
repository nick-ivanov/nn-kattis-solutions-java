// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class filip {
    public static String reverseString(String s) {
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--) result += s.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(reverseString(scanner.next()));
        int b = Integer.parseInt(reverseString(scanner.next()));
        System.out.println(a > b ? a : b);
    }
}
