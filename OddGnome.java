// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class OddGnome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int m = scanner.nextInt();

            ArrayList<Integer> nums = new ArrayList<>(m);
            for(int j = 0; j < m; j++) {
                nums.add(scanner.nextInt());
            }


            int prev = nums.get(0);
            for(int j = 1; j < nums.size(); j++) {
                if(nums.get(j) != prev+1) {
                    System.out.println(j+1);
                    break;
                }

                prev = nums.get(j);
            }
        }

    }
}
