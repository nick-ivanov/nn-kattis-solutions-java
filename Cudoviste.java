// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class Cudoviste {
    private static String stringifyTwoDimentionalArray(char[][] array) {
        String result = "{\n";

        for(int i = 0; i < array.length; i++) {
            result += "    [ ";
            for(int j = 0; j < array[0].length; j++) {
                result += j == array[0].length-1 ? array[i][j] : array[i][j] + ", ";
            }
            result += " ]\n";
        }

        return result + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int C = scanner.nextInt();

        char[][] map = new char[R][C];

        for(int i = 0; i < R; i++) {
            String s = scanner.next();
            for(int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        char pickV[] = new char[4];

        int smash0 = 0, smash1 = 0, smash2 = 0, smash3 = 0, smash4 = 0;

        for(int i = 0; i < R-1; i++) {
            for(int j = 0; j < C-1; j++) {
                pickV[0] = map[i][j];
                pickV[1] = map[i][j+1];
                pickV[2] = map[i+1][j];
                pickV[3] = map[i+1][j+1];

                int hashes = 0;
                int dots = 0;
                int xs = 0;

                for(int k = 0; k < 4; k++) {
                    if(pickV[k] == '#') hashes++;
                    if(pickV[k] == '.') dots++;
                    if(pickV[k] == 'X') xs++;
                }

                if(hashes > 0) {
                    continue;
                }

                if(dots == 4) {
                    smash0++;
                    continue;
                }

                if(dots == 3 && xs == 1) {
                    smash1++;
                    continue;
                }

                if(dots == 2 && xs == 2) {
                    smash2++;
                    continue;
                }

                if(dots == 1 && xs == 3) {
                    smash3++;
                    continue;
                }

                if(xs == 4) {
                    smash4++;
                    continue;
                }

            }
        }

        System.out.println(smash0);
        System.out.println(smash1);
        System.out.println(smash2);
        System.out.println(smash3);
        System.out.println(smash4);
    }
}
