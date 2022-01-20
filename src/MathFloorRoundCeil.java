
public class MathFloorRoundCeil {
    public static void main(String[] args) {
        double[] nums = { 1.4, 1.5, 1.6, -1.0, -11.4, -11.6, -11.5 };
        for (double num : nums) {
            test(num);
        }
    }

    private static void test(double num) {
        // floor 返回不大于参数（<=）的最大整数，比如1.4，floor的结果是 1.0; 2.7，floor的结果是 2.0
        System.out.println("Math.floor(" + num + ") = " + Math.floor(num));
        // round 方法，它表示“四舍五入”，算法为Math.floor(x + 0.5)，即将原来的数字加上0.5后再向下取整，
        // 所以，Math.round(11.5)的结果为12，Math.round(-11.5)的结果为-11。
        System.out.println("Math.round(" + num + ") = " + Math.round(num));
        // ceil 则是取大于等于(>=)参数的的最小整数
        System.out.println("Math.ceil(" + num + ") = " + Math.ceil(num));
    }
}
