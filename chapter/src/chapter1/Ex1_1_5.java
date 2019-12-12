package chapter1;

import edu.princeton.cs.algs4.*;

//@Author:liujinxin
//@Email :<724959554@qq.com>
//@Since :
//@Date  :2019/11/14
//@Description :

public class Ex1_1_5 {
    public static void main(String[] args) {
        double x=StdIn.readDouble();
        double y=StdIn.readDouble();
        if(0<x&&x>1&&y<1&&y>0)
            System.out.printf("true");
        else
            System.out.printf("false");
    }
}
