// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class arotationsequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            String s = scanner.next();

            int p = Integer.parseInt(s.split("/")[0]);
            int q = Integer.parseInt(s.split("/")[1]);

            String path = "";

            while(p != 1 || q != 1) {
                if(p < q) {
                    q = q - p;
                    path += "l";
                } else {
                    p = p - q;
                    path += "r";
                }
            }

            int count = 1;

            for(int j = path.length()-1; j >= 0; j--) {
                if(path.charAt(j) == 'l') count *= 2;
                if(path.charAt(j) == 'r') count = (count * 2) + 1;
            }

            System.out.printf("%d %d\n", k, count);
        }
    }
}
