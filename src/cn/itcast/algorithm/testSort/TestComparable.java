package cn.itcast.algorithm.testSort;


import cn.itcast.algorithm.sort.Student;

//2.定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class TestComparable {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setUsername("lmx");
        student1.setAge(19);
        student2.setUsername("wys");
        student2.setAge(20);
        Comparable max = getMax(student1, student2);
        System.out.println("年龄较大的学生为：" + max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        //if result < 0 ,则 c1 < c2
        //if result > 0 ,则 c1 > c2
        //if result = 0 ,则 c1 = c2
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
