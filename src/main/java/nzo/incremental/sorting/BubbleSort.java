package nzo.incremental.sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the capacity of the array:");
        int capacity = scan.nextInt();

        System.out.println("Enter the values:");
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = scan.nextInt();
        }

        bubblesort(array);
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public static void bubblesort(int[]array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array [j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
