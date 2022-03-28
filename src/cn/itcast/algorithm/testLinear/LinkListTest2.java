package cn.itcast.algorithm.testLinear;

import cn.itcast.algorithm.linear.LinkList;

public class LinkListTest2 {
    public static void main(String[] args) {
        //创建单向链表对象
        LinkList<String> s1 = new LinkList<>();
        //测试插入
        s1.insert("火影忍者");
        s1.insert("海贼王");
        s1.insert("鬼灭之刃");
        s1.insert(2, "咒术回战");

        //遍历
        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("-----------------------");
        s1.reverse();
        for (String s : s1) {
            System.out.println(s);
        }


    }
}
