package cn.itcast.algorithm.testLinear;

import cn.itcast.algorithm.linear.LinkList;
import cn.itcast.algorithm.linear.TwoWayLinkList;

public class TwoWayLinkListTest {
    public static void main(String[] args) {
        //创建单向链表对象
        TwoWayLinkList<String> s1 = new TwoWayLinkList<>();
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
        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());

        //测试获取
        String result = s1.get(1);
        System.out.println("获取索引1处的结果为：" + result);

        //测试删除
        String remove = s1.remove(1);
        System.out.println("删除的元素为：" + remove);

        //测试清空
        s1.clear();
        System.out.println(s1.length());


    }
}
