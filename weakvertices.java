// Copyright (C) 2017 Nick Ivanov <nnrowan@gmail.com>

import java.util.*;


class IntegerMatrix {
    private ArrayList<ArrayList<Integer>> data;

    public IntegerMatrix(int size) {
        data = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < size; j++) row.add(0);
            data.add(row);
        }
    }

    public int getRC(int r, int c) {
        return data.get(r).get(c);
    }

    public int getXY(int x, int y) {
        return getRC(y, x);
    }

    public void setRC(int r, int c, int value) {
        data.get(r).set(c, value);
    }

    public void setXY(int x, int y, int value) {
        data.get(y).set(x, value);
    }

    @Override
    public String toString() {
        String s = "";

        for(int i = 0; i < data.size(); i++) {
            for(int j = 0; j < data.size(); j++) {
                s += String.format("%5d", data.get(i).get(j));
            }
            s += "\n";
        }
        return s;
    }
}


public class weakvertices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            short n = scanner.nextShort();
            if(n == -1) break;

            IntegerMatrix matrix = new IntegerMatrix(n);

            for (short i = 0; i < n; i++) {
                for (short j = 0; j < n; j++) {
                    matrix.setRC(i, j, scanner.nextInt());
                }
            }

            HashSet<Integer> tmp = new HashSet<>();
            ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    for(int k = 0; k < n; k++) {
                        if(i != j && i != k && j != k) {
                            if(matrix.getRC(i, j) == 1 && matrix.getRC(i, k) == 1 && matrix.getRC(j, k) == 1) {
                                if(!tmp.contains(i)) tmp.add(i);
                            }
                        }
                    }
                }
            }

            for(int i = 0; i < n; i++) {
                if(!tmp.contains(i)) result.add(i);
            }

            for(int item : result) System.out.printf("%d ", item);
            System.out.println();
        }
    }
}
