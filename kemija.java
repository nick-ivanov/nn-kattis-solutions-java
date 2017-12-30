// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class kemija {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replace("apa", "a");
        s = s.replace("epe", "e");
        s = s.replace("ipi", "i");
        s = s.replace("opo", "o");
        s = s.replace("upu", "u");

        System.out.println(s);
    }
}
