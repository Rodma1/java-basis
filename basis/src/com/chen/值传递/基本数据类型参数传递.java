package com.chen.值传递;

/**
 * Java 程序设计语言总是采用按值调用。也就是说，方法得到的是所有参数值的一个拷贝，
 * 也就是说，方法不能修改传递给它的任何参数变量的内容。
 */
public class 基本数据类型参数传递 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
/**
 * 在 swap 方法中，a、b 的值进行交换，并不会影响到 num1、num2。
 * 因为，a、b 中的值，只是从 num1、num2 的复制过来的。也就是说，a、b
 * 相当于 num1、num2 的副本，副本的内容无论怎么修改，都不会影响到原件本身。
 */

}
