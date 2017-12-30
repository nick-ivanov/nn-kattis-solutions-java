// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class NNPair <T1, T2> {
    private T1 first;
    private T2 second;

    public NNPair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ":" + second.toString() + ">";
    }
}

public class synchronizinglists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        while((n = scanner.nextInt()) > 0) {
            ArrayList<NNPair<Integer, Integer>> list1 = new ArrayList<>();
            ArrayList<NNPair<Integer, Integer>> list2 = new ArrayList<>();
            ArrayList<NNPair<Integer, Integer>> list2Original = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0; i < n; i++) list1.add(new NNPair<>(i, scanner.nextInt()));

            for(int i = 0; i < n; i++)  {
                int a = scanner.nextInt();
                list2.add(new NNPair<>(i, a));
                list2Original.add(new NNPair<>(i, a));
            }

            for(int i = 0; i < n; i++) result.add(Integer.MIN_VALUE);

            //System.out.println(list1.toString());
            //System.out.println(list2.toString());
            //System.out.println();

            Comparator<NNPair<Integer, Integer>> comparator = new Comparator<NNPair<Integer, Integer>>() {
                @Override
                public int compare(NNPair<Integer, Integer> o1, NNPair<Integer, Integer> o2) {
                    if(o1.getSecond() > o2.getSecond()) {
                        return 1;
                    } else if (o1.getSecond() < o2.getSecond()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            };

            list1.sort(comparator);
            list2.sort(comparator);

            for (int i = 0; i < n; i++) {
                int ia = list1.get(i).getFirst();
                int ib = list2.get(i).getFirst();
                result.set(ia, list2Original.get(ib).getSecond());
            }

            //System.out.println(list1.toString());
            //System.out.println(list2.toString());

            for(int i = 0; i < n; i++) {
                System.out.println(result.get(i));
            }

            System.out.println();
        }

    }
}
