package 基本语法.Iteration;

import static java.util.stream.IntStream.range;


/**
 * 循环易错点
 */

public class demo {
    public static void main(String[] args) {
        int i=0;
        while(i>0){
            System.out.println("qq");      //先进行判断再选择要不要执行代码
        }

        do {
            i++;
            System.out.println("gg");   //先执行了do里面的代码再判断
        }while (i>0&&i<2);

        for(int j=0;j>0;){
            j++;
            System.out.println("hh");   //先判断再选择要不要执行代码
        }

        //Intstream.range()函数、iterate()替换for的新操作
        range(0,4).forEach(a -> System.out.println(a)); //这里的a是变量副本，即他是原来for（int i...）中的temp=i的temp。

//     IntStream.iterate(1, e -> e + 3)
//     .takeWhile(i -> i <= 100) //available in Java 9
//     .sum()
    }
}
