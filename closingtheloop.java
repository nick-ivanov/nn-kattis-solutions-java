// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class closingtheloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int s = scanner.nextInt();

            ArrayList<String> codes = new ArrayList<>();

            for(int j = 0; j < s; j++) codes.add(scanner.next());

            ArrayList<String> reds = new ArrayList<>();
            ArrayList<String> blues = new ArrayList<>();

            for(String item : codes) {
                if(item.charAt(item.length()-1) == 'R') reds.add(item);
                if(item.charAt(item.length()-1) == 'B') blues.add(item);
            }

            ArrayList<Integer> redLens = new ArrayList<>();
            ArrayList<Integer> blueLens = new ArrayList<>();

            for(String item: reds) {
                redLens.add(Integer.parseInt(item.substring(0, item.length()-1)));
            }

            for(String item: blues) {
                blueLens.add(Integer.parseInt(item.substring(0, item.length()-1)));
            }

            redLens.sort(Comparator.reverseOrder());
            blueLens.sort(Comparator.reverseOrder());

            if(redLens.size() == 0 || blueLens.size() == 0) {
                System.out.printf("Case #%d: 0\n", i+1);
                continue;
            }

            int sigma = 0;
            int nropes = 0;

            while(true) {
                if(redLens.isEmpty() || blueLens.isEmpty()) break;

                sigma += (redLens.get(0) + blueLens.get(0));

                if(redLens.get(0) == 1 && blueLens.get(0) == 1) {
                    nropes += 2;
                } else {
                    nropes += 2;
                }

                redLens.remove(0);
                blueLens.remove(0);
            }

            System.out.printf("Case #%d: %d\n", i+1, sigma - nropes);

        }
    }
}
