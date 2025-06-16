public class ComputeDoublePowers {
        public static void main(String[] args) {
        double x[];
        x = computeDoublePowers(5);
        System.out.println("The Element at index is: " + x[2]);
        }

        public static double[] computeDoublePowers(int n) {
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Math.pow(2, i);
            }

        // For sanity checking
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
            }

        return nums;
        }

        }
