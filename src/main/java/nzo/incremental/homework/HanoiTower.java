package nzo.incremental.homework;

import nzo.incremental.stacks.LinkedListStack;

public class HanoiTower {
    public static LinkedListStack<Integer>[] tower = new LinkedListStack[4];
    public static int N;

    public static void toh(Integer... values) {
        int numDisks = values.length;
        for (int i = 0; i < numDisks - 1; i++) {
            for (int j = i + 1; j < numDisks; j++) {
                if (values[i] > values[j]) {
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        for (int i = numDisks - 1; i >= 0; i--)
            tower[1].push(values[i]);
        display();
        move(numDisks, 1, 2, 3);
    }
    private static void move(int n, int a, int b, int c) {
        if (n > 0) {
            move(n-1, a, c, b);
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            move(n-1, b, a, c);
        }
    }
    public static void display() {
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        for(int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch(Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
        }
        System.out.println("\n");
    }
}
