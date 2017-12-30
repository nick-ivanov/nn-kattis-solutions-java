// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class prva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<String> rows = new ArrayList<>();
        ArrayList<String> cols = new ArrayList<>();

        for(int i = 0; i < r; i++) {
            rows.add(scanner.next());
        }

        for(int i = 0; i < c; i++) {
            String ss = "";
            for(int j = 0; j < r; j++) {
                ss += rows.get(j).charAt(i);
            }

            cols.add(ss);
        }

        ArrayList<String> words = new ArrayList<>();

        for(String item : rows) {
            for(String item1 : item.split("#")) {
                if(item1.length() >= 2) words.add(item1);
            }
        }

        for(String item : cols) {
            for(String item1 : item.split("#")) {
                if(item1.length() >= 2) words.add(item1);
            }
        }

        words.sort(Comparator.naturalOrder());

        System.out.println(words.get(0));

    }
}


