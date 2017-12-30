// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.HashSet;
import java.util.Scanner;

public class karte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        HashSet<String> fullDeck = new HashSet<>();

        for(int i = 1; i <= 13; i++) {
            fullDeck.add("P" + String.format("%02d", i));
            fullDeck.add("K" + String.format("%02d", i));
            fullDeck.add("H" + String.format("%02d", i));
            fullDeck.add("T" + String.format("%02d", i));
        }

        String ss;

        for(int i = 0; i < s.length(); i+= 3) {
            ss = s.substring(i, i+3);

            if(!fullDeck.contains(ss)) {
                System.out.println("GRESKA");
                return;
            }

            fullDeck.remove(ss);
        }

        int np = 0, nk = 0, nh = 0, nt = 0;

        for(String sss : fullDeck) {
            switch(sss.charAt(0)) {
                case 'P': np++; break;
                case 'K': nk++; break;
                case 'H': nh++; break;
                case 'T': nt++; break;
                default: break;
            }
        }

        System.out.println(String.valueOf(np) + " " + nk + " " + nh + " " + nt);
    }
}
