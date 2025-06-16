import java.util.Random;
import java.util.Scanner;

/**
 * 冒泡排序，以及有关random，scanner，array的练习
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = scan.nextInt();
        int[] arr = RandomArray(len);
        System.out.print("before sort: ");
        printArray(arr);
        Bubble_Sort(arr);
        System.out.print("after sort: ");
        printArray(arr);
    }

    // 创建一个新的随机数组，长度为用户输入的值
    public static int[] RandomArray(int len) {
        Random rand = new Random();
        int[] arr1 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = rand.nextInt(10);
        }
        return arr1;
    }
    // 冒泡排序
    public static void Bubble_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 打印数组
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
