package 基本语法.Assignment;

class Tank{
    int level;
}

/**
 * 对于原始类型int boolean double做复制操作之后，修改值，各自不会干涉。而类等不同。
 */
public class demo {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level=9;
        tank2.level=47;

        tank1.level = tank2.level;   //把tank2的level拷贝一份到tank1，两者各有一份

        tank1 = tank2;  //把tank2的指针指向tank1
        tank1.level = 35;
        System.out.println("tank1:"+tank1.level);
        System.out.println("tank2:"+tank2.level);


    }
}
