// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.HashMap;
import java.util.Scanner;

public class preludes {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> subs = new HashMap<>();
        subs.put("Ab minor", "G# minor");
        subs.put("A# major", "Bb major");
        subs.put("A# minor", "Bb minor");
        subs.put("C# major", "Db major");
        subs.put("Db minor", "C# minor");
        subs.put("D# major", "Eb major");
        subs.put("D# minor", "Eb minor");
        subs.put("Gb major", "F# major");
        subs.put("Gb minor", "F# minor");
        subs.put("G# major", "Ab major");

        subs.put("G# minor", "Ab minor");
        subs.put("Bb major", "A# major");
        subs.put("Bb minor", "A# minor");
        subs.put("Db major", "C# major");
        subs.put("C# minor", "Db minor");
        subs.put("Eb major", "D# major");
        subs.put("Eb minor", "D# minor");
        subs.put("F# major", "Gb major");
        subs.put("F# minor", "Gb minor");
        subs.put("Ab major", "G# major");


        int count = 1;
        while(scanner.hasNextLine()) {
            String s = scanner.nextLine();

            if(subs.containsKey(s)) {
                System.out.println("Case " + count + ": " + subs.get(s));
            } else {
                System.out.println("Case " + count + ": " + "UNIQUE");
            }

            count++;
        }
    }
}
