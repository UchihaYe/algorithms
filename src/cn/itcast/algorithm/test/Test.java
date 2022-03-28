package cn.itcast.algorithm.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字并用逗号隔开");
        String str = scanner.next();
        String[] strings = str.split(",");
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                System.out.println(strings[i]);
            } else {
                System.out.print(strings[i] + '_');
            }
        }
    }
}
