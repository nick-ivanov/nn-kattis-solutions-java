// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class timebomb {
    public static int getDigit(ArrayList<String> inp, int nn) {
        ArrayList<String> tmp = new ArrayList<>();

        for(String item : inp) {
            tmp.add(item.substring(4 * nn, 4 * nn + 3));
        }

        ArrayList<ArrayList<String>> templates = new ArrayList<>();
        templates.add(new ArrayList<String>(Arrays.asList("***", "* *", "* *", "* *", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("  *", "  *", "  *", "  *", "  *")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "  *", "***", "*  ", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "  *", "***", "  *", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("* *", "* *", "***", "  *", "  *")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "*  ", "***", "  *", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "*  ", "***", "* *", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "  *", "  *", "  *", "  *")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "* *", "***", "* *", "***")));
        templates.add(new ArrayList<String>(Arrays.asList("***", "* *", "***", "  *", "***")));

        int result = -1;

        for(int i = 0; i < 10; i++) {
            int count = 0;

            for(int j = 0; j < 5; j++) {
                if(tmp.get(j).equals(templates.get(i).get(j))) {
                    count++;
                }
                if(count == 5) return i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inp = new ArrayList<>();
        for(int i = 0; i < 5; i++) inp.add(scanner.nextLine());

        int ntotal = inp.get(0).length()/4 + 1;

        long sigma = 0;
        int exp = 0;
        for(int i = 0; i < ntotal; i++) {
            int digit = getDigit(inp, i);
            if(digit == -1) {
                continue;
            }
            sigma += Math.pow(10, ntotal - exp - 1) * getDigit(inp, i);
            exp++;
        }

        if(sigma % 6 == 0) {
            System.out.println("BEER!!");
        } else {
            System.out.println("BOOM!!");
        }
    }
}
