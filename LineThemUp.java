// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Scanner;

public class LineThemUp {
    private static enum Order { INIT, INCREASING, DECREASING, NEITHER; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> sV = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            sV.add(scanner.next());
        }

        Order order = Order.INIT;
        for(int i = 0; i < sV.size()-1; i++) {
            if(order == Order.INIT) {
                if(sV.get(i).compareTo(sV.get(i+1)) > 0) {
                    order = Order.DECREASING;
                }

                if(sV.get(i).compareTo(sV.get(i+1)) < 0) {
                    order = Order.INCREASING;
                }

                continue;
            }

            if(order == Order.INCREASING) {
                if(sV.get(i).compareTo(sV.get(i+1)) > 0) {
                    order = Order.NEITHER;
                    break;
                }
            }

            if(order == Order.DECREASING) {
                if(sV.get(i).compareTo(sV.get(i+1)) < 0) {
                    order = Order.NEITHER;
                    break;
                }
            }
        }

        switch(order) {
            case DECREASING:
                System.out.println("DECREASING");
                break;

            case INCREASING:
                System.out.println("INCREASING");
                break;

            case NEITHER:
                System.out.println("NEITHER");
                break;

            default:
                return;
        }
    }
}
