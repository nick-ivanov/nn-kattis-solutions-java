// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.HashSet;
import java.util.Scanner;

public class oddmanout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int g = scanner.nextInt();
            HashSet<Integer> codes = new HashSet<>();

            for(int j = 0; j < g; j++) {
                int c = scanner.nextInt();
                if(codes.contains(c)) codes.remove(c);
                else codes.add(c);
            }

            for(int item : codes) {
                System.out.println("Case #" + (i+1) + ": " + item);
            }
        }
    }
}
