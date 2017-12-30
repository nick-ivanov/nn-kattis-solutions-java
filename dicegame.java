// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class dicegame {
    public static double msum(int a1, int b1, int a2, int b2) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = a1; i <= b1; i++) {
            for(int j = a2; j <= b2; j++) {
                if(freq.containsKey(i+j)) {
                    freq.replace(i+j, freq.get(i+j) + 1);
                } else {
                    freq.putIfAbsent(i+j, 1);
                }
            }
        }

        int maxf = 0;

        ArrayList<Integer> tops = new ArrayList<>();

        for(int item : freq.keySet()) {
            if(freq.get(item) > maxf) {
                maxf = freq.get(item);
                tops.clear();
                tops.add(item);
            } else if(freq.get(item) == maxf) {
                tops.add(item);
            } else {
            }
        }

        //System.out.println(freq.toString());
        //System.out.println(tops.toString());

        double result = 0.0;

//        if(tops.size() % 2 == 0) {
//            result = ((double)tops.get(tops.size()/2 - 1) + (double)tops.get(tops.size()/2)) / 2;
//        } else {
//            result = (double) tops.get(tops.size()/2);
//        }

        for(int item : tops) {
            result += (double) item;
        }

        //result = tops.get(((tops.size() + 1) / 2) - 1);


       //System.out.println("FREQ: " + freq.toString());
       //System.out.println("TOPS: " + tops.toString());
       //System.out.println("RESULT: " + result);

        return result / (double) tops.size();
        //System.out.println(result);
        //return (double) result / (double) tops.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gunnar_a1 = scanner.nextInt();
        int gunnar_b1 = scanner.nextInt();
        int gunnar_a2 = scanner.nextInt();
        int gunnar_b2 = scanner.nextInt();

        int emma_a1 = scanner.nextInt();
        int emma_b1 = scanner.nextInt();
        int emma_a2 = scanner.nextInt();
        int emma_b2 = scanner.nextInt();

        double gunnar_sum = msum(gunnar_a1, gunnar_b1, gunnar_a2, gunnar_b2);
        double emma_sum = msum(emma_a1, emma_b1, emma_a2, emma_b2);

        if(gunnar_sum == emma_sum) {
            System.out.println("Tie");
        } else if(gunnar_sum > emma_sum) {
            System.out.println("Gunnar");
        } else {
            System.out.println("Emma");
        }
    }
}
