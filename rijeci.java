// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.Scanner;

class e {
    static final boolean logEnabled = true;
    public static void g(String s, String val) {if(logEnabled) System.out.println("["+s+"]: "+val);}
    public static void g() { g("###"); }
    public static void g(String s) { g("@", s); }
    public static void g(String s, Integer val) { g(s, val.toString()); }
    public static void g(String s, Long val) { g(s, val.toString()); }
    public static void g(String s, Double val) { g(s, val.toString()); }
    public static void g(String s, Boolean val) { g(s, val.toString()); }
    public static void g(String s, Character val) { g(s, val.toString()); }
}

public class rijeci {
    public static long fibo(int n) {
        long result = 0L;

        if(n == 0) { return 0L; }
        if(n == 1 || n == 2) { return 1L; }

        long ultimate = 1, penultimate = 1;

        for(int i = 3; i <= n; i++) {
            result = ultimate + penultimate;
            penultimate = ultimate;
            ultimate = result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("" + fibo(k-1) + " " + fibo(k));
    }
}
