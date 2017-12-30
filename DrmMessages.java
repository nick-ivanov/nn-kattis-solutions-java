// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.HashMap;
import java.util.Scanner;

public class DrmMessages {
    private static HashMap<Character, Integer> codes = new HashMap<>();
    private static HashMap<Integer, Character> chars = new HashMap<>();

    private static char rotate26(char ch, int value) {
        int code = (codes.get(ch) + value) % 26;
        return chars.get(code);
    }

    private static int magicSum(String s) {
        int sigma = 0;
        for(char ch : s.toCharArray()) {
            sigma += codes.get(ch);
        }

        return sigma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2, s.length());

        int index = 0;
        for(char ch = 'A'; ch <= 'Z'; ch++, index++) {
            codes.put(ch, index);
        }

        char ch = 'A';
        for(int i = 0; i < 26; i++, ch++) {
            chars.put(i, ch);
        }

        String s1r = "";
        String s2r = "";

        for(char c : s1.toCharArray()) {
            s1r += rotate26(c, magicSum(s1));
        }

        for(char c : s2.toCharArray()) {
            s2r += rotate26(c, magicSum(s2));
        }

        String result = "";

        for(int i = 0; i < s1r.length(); i++) {
            int rvalue = codes.get(s2r.charAt(i));
            result += rotate26(s1r.charAt(i), rvalue);
        }

        System.out.println(result);
    }
}
