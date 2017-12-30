// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

public class savingdaylight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month, day, year, sunrise, sunset;

        while(scanner.hasNext()) {
            month = scanner.next();
            day = scanner.next();
            year = scanner.next();
            sunrise = scanner.next();
            sunset = scanner.next();

            int sunrise_hr = Integer.parseInt(sunrise.split(":")[0]);
            int sunrise_min = Integer.parseInt(sunrise.split(":")[1]);
            int sunset_hr = Integer.parseInt(sunset.split(":")[0]);
            int sunset_min = Integer.parseInt(sunset.split(":")[1]);

            String result = "";

            int sunrise_timestamp = sunrise_hr * 60 + sunrise_min;
            int sunset_timestamp = sunset_hr * 60 + sunset_min;

            int delta = sunset_timestamp - sunrise_timestamp;

            int delta_hr = delta / 60;
            int delta_min = delta - delta_hr * 60;

            result = "" + delta_hr + " hours " + delta_min + " minutes";

            System.out.println(month + " " + day + " " + year + " " + result);
        }

    }
}
