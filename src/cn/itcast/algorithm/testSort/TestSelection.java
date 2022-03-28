package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Selection;

import java.util.Arrays;

public class TestSelection {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 8, 2, 7, 44, 4253, 545};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
