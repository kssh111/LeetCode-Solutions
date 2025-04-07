package src.Sqrtx;

public class Solution {
    public static int mySqrt(int x) {
        if (x == 0) return 0;  // Егер 0 болса, нәтижесі 0

        long left = 1; // Ең кіші мән 1
        long right = x; // Ең үлкен мән x
        long res = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2; // mid мәнін есептеу (overflow болдырмау үшін)
            if (mid * mid == x) {  // Егер дәл тең болса, ортаңғы мәнді қайтару
                return (int) mid;
            } else if (mid * mid < x) { // mid квадратынан кіші болса, оң жаққа жылжиық
                left = mid + 1;
                res = mid; // Ең жақын бүтін мән
            } else { // mid квадратынан үлкен болса, сол жаққа жылжиық
                right = mid - 1;
            }
        }

        return (int) res; // Жақын бүтін мәнді қайтарамыз
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;
        int x3 = 2147395599;
        System.out.println(mySqrt(x1)); // 2
        System.out.println(mySqrt(x2)); // 2
        System.out.println(mySqrt(x3)); // 46339
    }
}
