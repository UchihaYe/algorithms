package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Shell;

import java.util.Arrays;

public class TestShell {

    public static void main(String[] args) {
        Integer[] arr = {9, 8, 7, 8, 9, 3, 5, 4};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
