package src.UglyNumber;

public class Solution {
    public static boolean isUgly(int n) {
        if(n<=0) return false;
        int [] factors = {2,3,5};

        for(int factor : factors){
            while(n % factor == 0){
                n/=factor;
            }
        }
        return n==1;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 1;
        int num3 = 14;
        System.out.println(isUgly(num1));
        System.out.println(isUgly(num2));
        System.out.println(isUgly(num3));
    }
}
