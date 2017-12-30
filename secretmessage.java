// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class secretmessage {

    static int integerSqrtRoundUp(int num) {
        int sq = (int) Math.sqrt(num);
        return sq*sq < num ? sq + 1 : sq;
    }

    static String encode(String msg) {
        int m = integerSqrtRoundUp(msg.length());
        for(int i = msg.length(); i < m * m; i++) msg += "*";

        String result = "";

        for(int i = 0; i < m; i++) {
            for(int r = m-1; r >= 0; r--) {
                char ch = msg.charAt(m*r + i);
                if(ch != '*') result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            String msg = scanner.next();
            System.out.println(encode(msg));
        }
    }
}
