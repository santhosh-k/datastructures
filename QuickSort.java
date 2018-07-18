package com.company;

public class QuickSort {
    public static void main(String[] args) {
        int numbers[] = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        System.out.println("Unsorted Array");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted Array");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    private static void quickSort(int[] numbers, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotPoint = partition(numbers, start, end);
        quickSort(numbers, 0, pivotPoint - 1);
        quickSort(numbers, pivotPoint + 1, end);
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivotValue = numbers[end];
        int j = start;
        int i = start-1;
        while(j<=end){
            if(numbers[j]<=pivotValue){
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            j++;
        }
        return i;
    }
}
