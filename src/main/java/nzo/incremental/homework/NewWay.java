package nzo.incremental.homework;

import nzo.incremental.stacks.LinkedListStack;

import java.util.Scanner;
public class NewWay
{
    public static int N;
    public static LinkedListStack<Integer>[] tower = new LinkedListStack[4];

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        tower[1] = new LinkedListStack<Integer>();
        tower[2] = new LinkedListStack<Integer>();
        tower[3] = new LinkedListStack<Integer>();
        System.out.println("Enter number of disks");
        int num = scan.nextInt();
        N = num;
        toh(num);
    }
    public static void toh(int n) {
        for (int d = n; d > 0; d--)
            tower[1].push(d);
        display();
        move(n, 1, 2, 3);
    }

    public static void move(int n, int a, int b, int c) {
        if (n > 0) {
            move(n-1, a, c, b);
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            move(n-1, b, a, c);
        }
    }
    public static void display()
    {
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        for(int i = N - 1; i >= 0; i--)
        {
            String d1 = " ", d2 = " ", d3 = " ";
            try
            {
                d1 = String.valueOf(tower[1].get(i));
            }
            catch (Exception e){
            }
            try
            {
                d2 = String.valueOf(tower[2].get(i));
            }
            catch(Exception e){
            }
            try
            {
                d3 = String.valueOf(tower[3].get(i));
            }
            catch (Exception e){
            }
            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
        }
        System.out.println("\n");
    }
}