package 基本语法.Literals;

public class demo {
    public static void main(String[] args) {
        int i1 = 0x2f;      //0x表示16进制
        int i2 = 0x2F;      //两个值相同
        int i4 = 02;        //0表示十进制
        int i3 = 0177;      //八进制最大值
        char c = 0xffff;    //char的最大十六进制
        byte b = 0x7f;      //byte的最大十六进制
        short s =0x7fff;    //short的最大十六进制
        long l1 = 300l;

        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(Integer.toBinaryString(i3));
        System.out.println(Integer.toBinaryString(i4));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(s));
        System.out.println(Integer.toBinaryString(i1));
    }
}
