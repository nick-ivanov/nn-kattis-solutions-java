// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(9);

        for(int i = 0; i < 9; i++) {
            numbers.add(scanner.nextInt());
        }

        int sigma = 0;
        for(int item : numbers) {
            sigma += item;
        }

        int res1 = -1, res2 = -1;

        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sigma - numbers.get(i) - numbers.get(j) == 100) {
                    res1 = numbers.get(i);
                    res2 = numbers.get(j);
                }
            }
        }

        for(int item : numbers) {
            if(item != res1 && item != res2) {
                System.out.println(item);
            }
        }

        scanner.close();
    }
}
