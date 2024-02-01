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

        System.out.println("Enter number of disks");
        int num = scan.nextInt();

        System.out.println("Enter the values separated by spaces:");
        Integer[] values = new Integer[num];
        for (int i = 0; i < num; i++) {
            values[i] = scan.nextInt();
        }

        HanoiTower.N = num;
        HanoiTower.toh(values);
    }
}