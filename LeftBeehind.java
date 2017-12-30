// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeftBeehind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x + y == 13) {
                System.out.println("Never speak again.");
                continue;
            }

            if(x == 0 && y == 0) {
                break;
            }

            if(y > x) {
                System.out.println("Left beehind.");
            }

            if(x > y) {
                System.out.println("To the convention.");
            }

            if(x == y) {
                System.out.println("Undecided.");
            }







        }


    }
}
