// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class volim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Integer> times = new ArrayList<>();
        ArrayList<String> events = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            times.add(scanner.nextInt());
            events.add(scanner.next());
        }

        int timeCount = 0;
        int player = k;

        for(int i = 0; i < n; i++) {
            timeCount += times.get(i);
            if(timeCount > 210) break;

            if(events.get(i).equals("T")) {
                player++;
                if(player == 9) player = 1;
            }

        }

        System.out.println(player);
    }
}
