package cn.itcast.algorithm.test;

import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        String i_love_you = trans("I love you", 1);
        System.out.println(i_love_you);
    }

    public static String trans(String s, int n) {
        String[] strArray = s.split(" ",-1);
        StringBuilder strbuild = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            strbuild.append(reverse(strArray[i])); //数组转换为字符串
            //最后一个字符串后面不再附加空格
            if (i == 0) {
                break;
            }
            //字符串之间附加空格
            strbuild.append(" ");
        }
        return strbuild.toString();
    }

    //大小写转换
    private static String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                res.append((char) (ch - 32));
            } else {
                //大写字母+32转为小写
                res.append((char) (ch + 32));
            }
        }
        return res.toString();
    }
}
