import java.lang.*;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] inputArray = new int[100];
        long start = System.nanoTime();
        System.out.println("before:");

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = rand.nextInt(1000);
        }

        printArray(inputArray);

        // merge sort
        merge_sort(inputArray);
        long end = System.nanoTime();
        System.out.println();
        System.out.println("after:");
        double time = (end - start) / 1000000000.0;
        printArray(inputArray);
        System.out.println();
        System.out.printf("running time: %.9f seconds\n", time);

    }

    // the method is recursive
    public static void merge_sort(int[] inputArray) {
        int inputLength = inputArray.length;

        // reached the smallest unit
        if (inputLength < 2) {
            return;
        }

        int midLength = inputLength / 2;

        int[] leftHalf = new int[midLength];
        int[] rightHalf = new int[inputLength - midLength];

        for (int i = 0; i < midLength; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midLength; i < inputLength; i++) {
            rightHalf[i-midLength] = inputArray[i];
        }

        merge_sort(leftHalf);
        merge_sort(rightHalf);
        merge(inputArray,leftHalf,rightHalf);

    }


    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // sort every passes
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // if the right half runs out of itself, the remaining of the left half will be added to the array, vice versa
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+" ");
        }
    }
}
