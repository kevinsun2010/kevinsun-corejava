package com.kevinsun.corejava.javaversion.java8.lambda;
/*
* Lambda 表达式相信不用再过多的介绍，终于在 Java 8 引入了，
* 可以极大的减少代码量，代码看起来更清爽。
   函数式接口就是有且仅有一个抽象方法，
* 但是可以有多个非抽象方法的接口。可以隐式转化为 Lambda 表达式。
*
*
* */
@FunctionalInterface
interface Operation {
    int operation(int a, int b);

    public default int operation(int a, int b, int c){

        return a;
    }
}


