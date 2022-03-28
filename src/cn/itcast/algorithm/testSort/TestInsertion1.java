package cn.itcast.algorithm.testSort;

import cn.itcast.algorithm.sort.Insertion;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertion1 {
    public static void main(String[] args) {
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split(",");
        Integer[] b = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = Integer.parseInt(arr[i]);
        }
        Insertion.sort(b);
        System.out.println(Arrays.toString(b));
//        for (int j = 0; j < b.length; j++) {
//            b[j] = Integer.parseInt(arr[j]);
//            System.out.println(b[j] + " ");
//        }
    }
}
