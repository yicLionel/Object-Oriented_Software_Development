import java.util.Scanner;

public class Binary_Search {
    public static int binary_search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right-left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter array: ");
        int[] nums = new int[n];
        for (int i = 0; i< nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter number to be searched: ");
        int target = scanner.nextInt();

        int answer = binary_search(nums, target);
        if (answer == -1) {
            System.out.println("!!AHH, number not found!!");
        }

    }
}
