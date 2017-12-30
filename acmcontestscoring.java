// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.HashMap;
import java.util.Scanner;

public class acmcontestscoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> problems = new HashMap<>();

        int rightCount = 0;
        int scoreSum = 0;

        while(true) {
            int time = scanner.nextInt();
            if(time == -1) break;

            String title = scanner.next();
            String result = scanner.next();

            if(!problems.keySet().contains(title)) {
                if(result.equals("wrong")) {
                    problems.put(title, 20);
                } else if(result.equals("right")) {
                    problems.put(title, time);
                    rightCount++;
                    scoreSum += time;
                }
            } else {
                if(result.equals("wrong")) {
                    problems.replace(title, problems.get(title) + 20);
                } else if(result.equals("right")) {
                    problems.replace(title, problems.get(title) + time);
                    rightCount++;
                    scoreSum += problems.get(title);
                } else {}
            }
        }

        System.out.println("" + rightCount +  " " + scoreSum);
    }
}
