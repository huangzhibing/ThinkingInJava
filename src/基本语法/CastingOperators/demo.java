package 基本语法.CastingOperators;

/**
 * 强制类型装换
 */
public class demo {
    public static void main(String[] args) {
        double a=0.4,b=0.5;
        float c=0.8f,d=0.9f;

        System.out.println(c);
        System.out.println(d);
        System.out.println((int)a);//0     //这里的double或者float的强制类型装换会对数据进行取整，而不是四舍五入@！
        System.out.println((int)b);//0
        System.out.println((int)c);//0
        System.out.println((int)d);//0

        System.out.println(Math.round(a));//0       //要想四舍五入，就用Math.round()函数
        System.out.println(Math.round(b));//1
        //System.out.println(a.sizeof());         //java没有sizeof函数去获取当前内存长度。都是用类型来固定，比如int4个字节，long8个字节。
        short e=11111;

        System.out.println((byte)e);        //转换的时候，小的可以转换成大的，但是大的不一定能能装换成小的（溢出）
                                            //还有就是float*double，结果就变成double型的。int加long，结果就是long型的等等。。
    }

}
