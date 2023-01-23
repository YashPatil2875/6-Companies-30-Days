public class Q2_week3 {
    public static boolean increasingTriplet(int[] nums) {

        for (int i = 0; i < nums.length - 3; i++) {
            if ((nums[i] < nums[i + 1]) || (nums[i + 1] < nums[i + 2])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        //case 1
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(nums));

        // case 2
        int[] num = { 5, 4, 3, 2, 1 };
        System.out.println(increasingTriplet(num));

        //case 3
        int[] nu = { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(nu));
    }
}
