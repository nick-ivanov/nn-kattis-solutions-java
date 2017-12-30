// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class server {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();

		int sigma = 0;
		int count = 0;

		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}

		int i = 0;
		while(i < n) {
			int inp = arr.get(i);
			sigma += inp;
			if(sigma > t) break;

			count++;
			// i = (i == arr.size()-1) ? 0 : i + 1;
			i++;
		}

		System.out.println(count);
	}
}