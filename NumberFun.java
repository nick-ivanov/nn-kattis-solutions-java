// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            boolean clearForTakeoff = false;

            if(a + b == c) { clearForTakeoff = true; }
            if(a * b == c) { clearForTakeoff = true; }
            if(a / b == c && a % b == 0) { clearForTakeoff = true; }
            if(b / a == c && b % a == 0) { clearForTakeoff = true; }
            if(a - b == c) { clearForTakeoff = true; }
            if(b - a == c) { clearForTakeoff = true; }

            String s = clearForTakeoff ? "Possible" : "Impossible";
            System.out.println(s);
        }
    }

}
