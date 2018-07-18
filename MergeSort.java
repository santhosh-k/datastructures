package com.company;

public class MergeSort {
    public static void main(String[] args) {
        int numbers[] = {5, 7, 2, 9, 1, 6, 3, 4, 0, 8};
        System.out.println("Unsorted Array");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        mergeSort(numbers);
        System.out.println("Sorted Array");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] numbers) {
        int size = numbers.length;
        if (size < 2) {
            return;
        }
        int mid = (size) / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = numbers[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = numbers[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, numbers);
    }

    private static void merge(int[] left, int[] right, int numbers[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                numbers[k] = left[i];
                i++;
            } else if (right[j] < left[i]) {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}
