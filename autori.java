// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = "";

        boolean addFlag = true;

        for(char ch : s.toCharArray()) {
            if(addFlag) {
                result += ch;
                addFlag = false;
            }

            if(ch == '-') addFlag = true;
        }

        System.out.println(result);
    }
}
