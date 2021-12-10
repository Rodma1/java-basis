package com.cheng.reflection;

import java.util.Objects;

//什么叫反射
public class Test01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException{
//        通过反射获取类的class对象
        Class c1= Class.forName("com.cheng.reflection.User");
        System.out.println(c1);
        Class c2= Class.forName("com.cheng.reflection.User");
        Class c3= Class.forName("com.cheng.reflection.User");

//        一个类在内存中只有一个class对象
//        一个类被加载后，类的整个结构都会被封装在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

    }
}


//定义一个实体类
class User{
    int age;
    String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}