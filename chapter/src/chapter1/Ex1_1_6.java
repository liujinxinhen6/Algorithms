//@Author: liujinxin
//@Email : <724959554@qq.com>
//@Since : 
//@Date  : 2019/11/14
//@Description :
package chapter1;

import edu.princeton.cs.algs4.*;

public class Ex1_1_6 {
    public static void main(String[] args) {
        int f=0;
        int g=1;
        for (int i=0;i<= 15; i++)
        {
            System.out.println(f);
            f = f+g;
            g = f-g;
    }

    }
}


