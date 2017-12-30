// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String name;

        int courses;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate start, dob;

        for(int i = 0; i < n; i++) {
            name = scanner.next();
            start = LocalDate.parse(scanner.next(), f);
            dob = LocalDate.parse(scanner.next(), f);
            courses = scanner.nextInt();

            if(dob.getYear() >= 1991 || start.getYear() >= 2010) {
                System.out.println(name + " eligible");
            } else {
                if(courses > 40) {
                    System.out.println(name + " ineligible");
                } else {
                    System.out.println(name + " coach petitions");
                }
            }
        }
    }
}
