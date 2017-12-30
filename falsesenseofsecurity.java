// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class falsesenseofsecurity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX_MESSAGES = 3000;

        HashMap<Character, String> abcToMorse = new HashMap<>();
        abcToMorse.put('A', ".-");
        abcToMorse.put('B', "-...");
        abcToMorse.put('C', "-.-.");
        abcToMorse.put('D', "-..");
        abcToMorse.put('E', ".");
        abcToMorse.put('F', "..-.");
        abcToMorse.put('G', "--.");
        abcToMorse.put('H', "....");
        abcToMorse.put('I', "..");
        abcToMorse.put('J', ".---");
        abcToMorse.put('K', "-.-");
        abcToMorse.put('L', ".-..");
        abcToMorse.put('M', "--");
        abcToMorse.put('N', "-.");
        abcToMorse.put('O', "---");
        abcToMorse.put('P', ".--.");
        abcToMorse.put('Q', "--.-");
        abcToMorse.put('R', ".-.");
        abcToMorse.put('S', "...");
        abcToMorse.put('T', "-");
        abcToMorse.put('U', "..-");
        abcToMorse.put('V', "...-");
        abcToMorse.put('W', ".--");
        abcToMorse.put('X', "-..-");
        abcToMorse.put('Y', "-.--");
        abcToMorse.put('Z', "--..");
        abcToMorse.put('_', "..--");
        abcToMorse.put('.', "---.");
        abcToMorse.put(',', ".-.-");
        abcToMorse.put('?', "----");

        HashMap<String, Character> morseToAbc = new HashMap<>();
        morseToAbc.put(".-", 'A');
        morseToAbc.put("-...", 'B');
        morseToAbc.put("-.-.", 'C');
        morseToAbc.put("-..", 'D');
        morseToAbc.put(".", 'E');
        morseToAbc.put("..-.", 'F');
        morseToAbc.put("--.", 'G');
        morseToAbc.put("....", 'H');
        morseToAbc.put("..", 'I');
        morseToAbc.put(".---", 'J');
        morseToAbc.put("-.-", 'K');
        morseToAbc.put(".-..", 'L');
        morseToAbc.put("--", 'M');
        morseToAbc.put("-.", 'N');
        morseToAbc.put("---", 'O');
        morseToAbc.put(".--.", 'P');
        morseToAbc.put("--.-", 'Q');
        morseToAbc.put(".-.", 'R');
        morseToAbc.put("...", 'S');
        morseToAbc.put("-", 'T');
        morseToAbc.put("..-", 'U');
        morseToAbc.put("...-", 'V');
        morseToAbc.put(".--", 'W');
        morseToAbc.put("-..-", 'X');
        morseToAbc.put("-.--", 'Y');
        morseToAbc.put("--..", 'Z');
        morseToAbc.put("..--", '_');
        morseToAbc.put("---.", '.');
        morseToAbc.put(".-.-", ',');
        morseToAbc.put("----", '?');

        String msg = "";
        while(scanner.hasNext()) {
            msg = scanner.next();

            if(msg.length() > 1000) {
                System.out.println("OOPS!");
                return;
            }

            String tmp = "";
            ArrayList<Integer> nums = new ArrayList<>();

            for(Character item : msg.toCharArray()) {
                    if(abcToMorse.containsKey(item)) {
                        tmp += abcToMorse.get(item);
                        nums.add(abcToMorse.get(item).length());
                    } else {
                        System.out.println("Oops!");
                        return;
                    }
            }

            ArrayList<Integer> numsReverse = new ArrayList<>();

            for(int ii = nums.size() - 1; ii >= 0; ii--) {
                numsReverse.add(nums.get(ii));
            }

            msg = "";
            int j = 0;
            for(int ii = 0; ii < numsReverse.size(); ii++) {
                if(j + numsReverse.get(ii) > tmp.length()) {
                    System.out.println("Oops #2!");
                    return;
                }

                String morse = tmp.substring(j, j + numsReverse.get(ii));

                if(morseToAbc.containsKey(morse)) {
                    msg += morseToAbc.get(morse);
                } else {
                    System.out.println("Oops #3!");
                    return;
                }

                j += numsReverse.get(ii);
            }

            System.out.println(msg);
        }
    }
}
