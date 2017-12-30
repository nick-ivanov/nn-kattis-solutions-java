// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class raggedright {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> text = new ArrayList<>();

        String inp;
        int mx = 0;

        while(scanner.hasNextLine()) {
            inp = scanner.nextLine();
            text.add(inp);
            mx = inp.length() > mx ? inp.length() : mx;
        }

        text.remove(text.size()-1);

        int sigma = 0;
        for(String s : text) {
            int m = s.length();
            sigma += ((mx-m)*(mx-m));
        }

        System.out.println(sigma);
    }
}
