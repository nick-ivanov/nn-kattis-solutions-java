// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class yinandyangstones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int nw = 0, nb = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'W') nw++;
            if(s.charAt(i) == 'B') nb++;
        }

        if(nw == nb) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }


/*        for(int i = 0; i < s.length(); i++) {
            String tmp1 = s.substring(0, i);
            String tmp2 = s.substring(i, s.length());
            String ss = tmp2 + tmp1;

            int nw = 0, nb = 0;
            for(int j = 0; j < ss.length(); j++) {
                if(ss.charAt(j) == 'W') nw++;
                if(ss.charAt(j) == 'B') nb++;

                if(nb == nw + 1) {
                    ss = "B" + ss.substring(j+1);
                    j = 1;
                    nb = 0;
                    nw = 0;
                }

                if(nw == nb + 1) {
                    ss = "W" + ss.substring(j+1);
                    j = 1;
                    nb = 0;
                    nw = 0;
                }
            }

            if(ss.equals("BW") || ss.equals("WB") || ss.isEmpty()) {
                System.out.println("1");
                return;
            }

        }
*/


    }


}
