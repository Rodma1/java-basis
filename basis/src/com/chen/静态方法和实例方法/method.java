package com.chen.静态方法和实例方法;

/**
 * 实例方法需要创建对象才能调用
 * 静态方法可以直接通过类名调用
 * 静态方法在访问本类的成员时，只允许访问静态成员（即静态成员变量和静态方法），
 * 不允许访问实例成员（即实例成员变量和实例方法），而实例方法不存在这个限制。
 */
public class method {
    private int a=1;
    private static int b=2;
//    定义实例方法
    public void example(){

        System.out.println("我是实例方法,可以访问a:"+a+"和b"+b);
    }
//    定义静态方法static
    public static void stmethod(){

        System.out.println("我是静态方法,只能访问b："+b);
    }

    public static void main(String[] args) {
//        调用静态方法
        method.stmethod();
//        定义对象调用实例方法
        method st=new method();
        st.example();

    }
}
