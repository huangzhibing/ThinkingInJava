package 基本语法.Switch;

import java.util.Random;

public class demo {
    public static void main(String[] args) {
        Random random = new Random(37);

        Object c = random.nextInt(100) + 'a';
        System.out.println((int)c);
//        System.out.println((char) c);     //运行时报错，int型+char型，没办法得到char型。

        int a = random.nextInt(100) + 'a';
        System.out.println((char)a);

//        System.out.println((String)1);    //string没办法进行强制类型装换

        String b = random.nextInt(100) + "a";   //int + string，结果变成int和string进行字符串拼接。
        System.out.println(b);


//        double flag = 0.01;
        String flag = "111133";
        switch (flag){      //switch的表达式不能为double型的，可以为int integer，byte Byte，char string
                            //若不是这些类型，编译的时候回就会报错
        }
    }
}
