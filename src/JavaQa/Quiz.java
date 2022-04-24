package JavaQa;

public class Quiz {
    public static double averageCount(double[] nums) {
        if (nums == null || nums.length == 0) return 0;

        double avaregcount = 0;
        for (int i = 0; i < nums.length; i++) {
            avaregcount += nums[i];
        }
        return avaregcount / nums.length;
    }

    public static int averageCount(int[] nums) {
        int averagcount = 0;
        for (int i = 0; i < nums.length; i++) {
            averagcount += nums[i];
        }
        return averagcount / nums.length;
    }

    public static void main(String[] args) {

        double[] nums = {2.1, 3.2, 1.7, 4.4, 5.8};
        System.out.println(averageCount(nums));
        System.out.println(averageCount(new double[]{2.1, 3.2, 1.7, 4.8, 5.9}));

        int[] nums1 = {12, 340, 160, 9, 160, 18, 89, 22, 34, 1, 0, 89, 340, 89, 340};

        int firstBig = 0;
        int secondBig = 0;

        for (int x = 0; x < nums1.length; x++) {
            if (firstBig < nums1[x]) {
                secondBig = firstBig;
                firstBig = nums1[x];
            }
            if (secondBig < nums1[x] && nums1[x] < firstBig) secondBig = nums1[x];
        }
        System.out.println(firstBig);
        System.out.println(secondBig);
//        System.out.println(nums1[9]);

        int[] nums2 = {12, 34, 9, 45, 6, 18, 89, 22, 1, 0, 89, 12, 45};

//        for (int x = nums2.length; x >0; x--) {
//            if (nums1[x] > nums1[x + 1]) {
//                int y = nums1[x];
//                nums1[x] = nums1[x + 1];
//                nums1[x + 1] = y;
//            }
//
//        }

        System.out.println(maxNumber(980, 3444, 5666, 1234));

    }

    public static int maxNumber(int a, int b, int c, int d) {
        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        int max;
        return max = max1 > max2 ? max1 : max2;
    }
}
