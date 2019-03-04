package 基本语法.TypeChange;

/**
 * 基本数据类型之间的转换规则
     1.在一个双操作数以及位运算等算术运算式中，会根据操作数的类型将低级的数据类型自动转换为高级的数据类型，分为以下几种情况：

     1）只要两个操作数中有一个是double类型的，另一个将会被转换成double类型，并且结果也是double类型；

     2）只要两个操作数中有一个是float类型的，另一个将会被转换成float类型，并且结果也是float类型；

     3）只要两个操作数中有一个是long类型的，另一个将会被转换成long类型，并且结果也是long类型；

     4）两个操作数（包括byte、short、int、char）都将会被转换成int类型，并且结果也是int类型。

     2. 如果低级类型为char型，向高级类型（整型）转换时，会转换为对应ASCII码值，再做其它类型的自动转换。

     3. 对于byte,short,char三种类型而言，他们是平级的，因此不能相互自动转换，可以使用下述的强制类型转换。 如：

     short i=99 ;
     char c=(char)i;
     System.out.println("output:"+c);

     4. 不能在布尔值和任何数字类型间强制类型转换；

     5. 不同级别数据类型间的强制转换，可能会导致溢出或精度的下降。

     6. 当字节类型变量参与运算，java作自动数据运算类型的提升，将其转换为int类型。例如：byte b;
     b=3;
     b=(byte)(b*3);//必须声明byte。
 */

public class Summary {
    //包装数据类型的转换
    public static void main(String[] args) {
        //其他类型向字符串转换
        Integer a = 10;
        //
        System.out.println(a.toString());
        System.out.println(a+"");
        System.out.println(String.valueOf(a));
        //
        //字符串向其他类型转换
        //1.先转换成封装器实例，再调用对应的方法转换成其他类型
        String b = "12.3";
        Float f = new Float(b).floatValue();
        System.out.println(f);
        Double d = new Double(b).doubleValue();
        System.out.println(d);
        //2.用静态parseXXX方法
        int i = Integer.parseInt("11"); //如果这里的字符串是“12.3”，那么编译不报错，运行时会报错
        System.out.println(i);
        System.out.println(Double.parseDouble(b));

        //易错点：
        System.out.println(""+2+3);     //23
        System.out.println(2+3+"");     //5!!!
        System.out.println(2+""+3);     //23
    }
}
