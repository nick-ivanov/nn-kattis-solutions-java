// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class kornislav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];

        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();

        int sq, sqmax = 0;

        for(int ia = 0; ia < 4; ia++) {
            for(int ib = 0; ib < 4; ib++) {
                for(int ic = 0; ic < 4; ic++) {
                    for(int id = 0; id < 4; id++) {
                        if(arr[ic] <= arr[ia] && arr[id] <= arr[ib]) {
                            if(ia != ib && ia != ic && ia != id && ib != ic && ib != id && ic != id) {
                                sq = arr[ic] * arr[id];
                                if (sq > sqmax) {
                                    sqmax = sq;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(sqmax);
    }
}
