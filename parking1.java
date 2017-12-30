// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class parking1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        IntStream.range(0, t).forEachOrdered(i -> {
            int n = scanner.nextInt();
            ArrayList<Integer> x = new ArrayList<>();
            IntStream.range(0, n).forEachOrdered(j -> {
                x.add(scanner.nextInt());
            });

            Collections.sort(x);

            int sigma = 0;

            for(int j = 1; j < n; j++) {
                sigma += (x.get(j) - x.get(j-1));
            }

            sigma += (x.get(x.size()-1) - x.get(0));

            System.out.println(sigma);
        });

    }
}
