package Sem2_4;

public class iConstID implements iConst {
    public static void main(String[] args) {

        int[] nums = new int[max];
        for (int i = min; i < 11; i++) {
            if (i >= max) {
                System.out.println(error);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
