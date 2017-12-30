// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UnbearableZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listNumber = 1;

        while(true) {
            int n = Integer.parseInt(scanner.nextLine());
            if(n == 0) { break; }

            HashMap<String, Integer> countsHashmap = new HashMap<>();
            ArrayList<String> animalsStringArray = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                String[] sArray = s.split(" ");
                String ss = sArray[sArray.length-1].toLowerCase();

                if(countsHashmap.containsKey(ss)) {
                   countsHashmap.put(ss, countsHashmap.get(ss) + 1);
                } else {
                    countsHashmap.put(ss, 1);
                    animalsStringArray.add(ss);
                }
            }

            animalsStringArray.sort(String::compareTo);

            System.out.println("List " + listNumber + ":");

            for(String item : animalsStringArray) {
                System.out.println(String.format("%s | %d", item, countsHashmap.get(item)));
            }

            listNumber++;
        }
    }
}
