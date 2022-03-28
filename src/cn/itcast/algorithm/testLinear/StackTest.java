package cn.itcast.algorithm.testLinear;

import cn.itcast.algorithm.linear.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("wys");
        strings.push("lmx");
        strings.push("clp");
        strings.push("xyl");
        for (String s:
             strings) {
            System.out.println(s);
        }
        System.out.println("__________________");
        while (!strings.isEmpty()){
            String pop = strings.pop();
            System.out.println("弹出的元素为 "+ pop);
        }
    }
}
