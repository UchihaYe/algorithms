package cn.itcast.algorithm.testSort;

import cn.itcast.algorithm.sort.Insertion;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待排序的数组");
        Integer[] arr = {3, 2, 1};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
