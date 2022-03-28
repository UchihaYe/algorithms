package cn.itcast.algorithm.testSort;

import cn.itcast.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {5, 8, 9, 7, 4, 5, 7, 3, 15, 87};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
