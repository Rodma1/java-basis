package com.chen.值传递;

/**
 * 对象引用作为参数会改变
 * 因为拷贝的和原来的是指向同一个对象
 * 一个方法不能让对象参数引用一个新的对象。
 */
public class 对象引用作为参数传递 {
    public static void change(int[] array){
        //    改变数据第一个元素
        array[0]=5;
    }

    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(array[0]);
        change(array);
        System.out.println(array[0]);
    }
/**
 * array 被初始化 arr 的拷贝也就是一个对象的引用，
 * 也就是说 array 和 arr 指向的是同一个数组对象。 因此，外部对引用对象的改变会反映到所对应的对象上。
 */

}
