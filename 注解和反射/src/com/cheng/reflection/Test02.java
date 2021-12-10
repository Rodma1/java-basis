package com.cheng.reflection;

//测试class类的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException{
//       获取student对象
        Person person=new Student();
        System.out.println("这个人是："+person.name);
        // 方式一：   通过对象获得
        Class c1=person.getClass();
        System.out.println(c1.hashCode());

//        方式二：forname获取
        Class c2=Class.forName("com.cheng.reflection.Student");
        System.out.println(c2.hashCode());
//        方式三：通过类名.class获得
        Class c3=Student.class;
        System.out.println(c3.hashCode());

        //方式4：基本内置类型的包装类都有一个Type 属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);

        ///获得父类类型
        Class superclass = c1.getSuperclass();
        System.out.println(superclass);

    }


}

class Person{
    String name;
    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
//    public Student() {
//        this.name="学生";
//    }
}