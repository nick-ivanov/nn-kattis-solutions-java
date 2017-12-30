// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class simonsays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		for(int i = 0; i < n; i++) {
		    if(scanner.hasNextLine()) {
                String s = scanner.nextLine();

                if(s.length() >= 11) {
                    if (s.substring(0, 11).equals("Simon says ")) {
                        System.out.println(s.substring(11));
                    }
                }
            }
		}
	}
}