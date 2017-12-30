// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class peg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> board = new ArrayList<>();
        for(int i = 0; i < 7; i++) board.add(scanner.nextLine());

        int width = board.get(0).length();
        int nmoves = 0;

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < 7; j++) {
                char ch = board.get(j).charAt(i);
                if(ch != 'o') continue;

                char n1 = (j == 0) ? 'x' : board.get(j-1).charAt(i);
                char e1 = (i == width-1) ? 'x' : board.get(j).charAt(i+1);
                char s1 = (j == 6) ? 'x' : board.get(j+1).charAt(i);
                char w1 = (i == 0) ? 'x' : board.get(j).charAt(i-1);

                char n2 = (j < 2) ? 'x' : board.get(j-2).charAt(i);
                char e2 = (i > width-3) ? 'x' : board.get(j).charAt(i+2);
                char s2 = (j > 4) ? 'x' : board.get(j+2).charAt(i);
                char w2 = (i < 2) ? 'x' : board.get(j).charAt(i-2);

                if(n1 == 'o' && n2 == '.') nmoves++;
                if(e1 == 'o' && e2 == '.') nmoves++;
                if(s1 == 'o' && s2 == '.') nmoves++;
                if(w1 == 'o' && w2 == '.') nmoves++;
            }
        }

        System.out.print(nmoves);
    }
}
