// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>


import java.util.ArrayList;
import java.util.Scanner;

class Pair {
    double x;
    double y;

    public Pair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


public class travellingsalesperson2d {

    static ArrayList<Pair> points = new ArrayList<>();

    public static int dist(int a, int b) {
        double x1 = points.get(a).getX();
        double y1 = points.get(a).getY();
        double x2 = points.get(b).getX();
        double y2 = points.get(b).getY();

        double d = Math.sqrt(Math.abs((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
        //System.out.println("x1: " + x1 + ", y1: " + y1 + ", x2: " + x2 + ", y2: " + y2 + ", d: " + d);
        return (int) Math.round(d);
    }

    public static int dist1(int a, int b) {
        return (int) Math.abs(points.get(a).getX() - points.get(a).getY());
    }

    public static ArrayList<Integer> greedyTour(int n) {
        ArrayList<Integer> tour = new ArrayList<>();
        ArrayList<Boolean> used = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tour.add(i);
            used.add(false);
        }

        tour.set(0, 0);
        used.set(0, true);

        for (int i = 1; i < n; i++) {
            int best = -1;
            for (int j = 0; j < n; j++) {
                if ((used.get(j) == false) && ((best == -1) || dist(tour.get(i - 1), j) < dist(tour.get(i - 1), best))) {
                    best = j;
                }
            }
            tour.set(i, best);
            used.set(best, true);
        }

        return tour;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points.add(new Pair(x, y));
        }

        for(int item : greedyTour(n)) {
            System.out.println(item);
        }
    }


}
