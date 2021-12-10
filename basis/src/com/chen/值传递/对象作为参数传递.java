package com.chen.值传递;

public class 对象作为参数传递 {
    //    定义对象
    public static class Name {
        private String name;

        public String getName() {
            return name;
        }

        public Name(String name) {
            this.name = name;
        }
    }
//交换两个数
    public static void swap(Name name1, Name name2) {
        Name temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("name1:" + name1.getName());
        System.out.println("name2:" + name2.getName());
    }

    public static void main(String[] args) {
        Name name1 = new Name("小李");
        Name name2 = new Name("小红");
        swap(name1,name2);
        System.out.println("name1:" + name1.getName());
        System.out.println("name2:" + name2.getName());
    }

    /**
     * 方法并没有改变存储在变量 s1 和 s2 中的对象引用。
     * swap 方法的参数 x 和 y 被初始化为两个对象引用的拷贝，这个方法交换的是这两个拷贝
     */
}
