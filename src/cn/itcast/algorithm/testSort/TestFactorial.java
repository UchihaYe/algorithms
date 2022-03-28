package cn.itcast.algorithm.testSort;

public class TestFactorial {
    public static void main(String[] args) {
        //求n的阶乘
        int factorial = factorial(9);
        System.out.println(factorial);

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
