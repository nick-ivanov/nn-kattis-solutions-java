// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class pervasiveheartmonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] sa = line.split(" ");

            String name = "";
            ArrayList<Double> rates = new ArrayList<>();

            for(String item : sa) {
                char ch = item.charAt(0);
                if(Character.isDigit(ch)) {
                    rates.add(Double.valueOf(item));
                } else {
                    if(name.equals("")) {
                        name += item;
                    } else {
                        name += (" " + item);
                    }
                }
            }

            double sigma = 0.0;

            for(Double item : rates) {
                sigma += item;
            }

            System.out.printf("%f %s\n", sigma / (double) rates.size(), name);
        }

    }
}
