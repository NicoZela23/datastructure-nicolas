package nzo.incremental.homework;

import nzo.incremental.stacks.LinkedListStack;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HanoiTower.tower[1] = new LinkedListStack<Integer>();
        HanoiTower.tower[2] = new LinkedListStack<Integer>();
        HanoiTower.tower[3] = new LinkedListStack<Integer>();

        int num = 4;


        System.out.println("Enter the values:");
        Integer[] values = new Integer[num];
        for (int i = 0; i < num; i++) {
            values[i] = scan.nextInt();
        }

        HanoiTower.N = num;
        HanoiTower.toh(values);
    }
}