package 基本语法.ObjectEquivalence;

/**
 * 1.==判断两个对象是否是同一个对象，即指针或者引用是否相同。
 * 2.equals()判断两个对象的值是否相等
 */

public class demo {
    static class Dog{
        String name;
        String says;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "哈哈";
        dog2.name = "哈哈";
        dog2.says = dog1.says ="嘿嘿";
        System.out.println(dog1 == dog2);       //false
        System.out.println(dog1.name == dog2.name);   //true
        System.out.println(dog1.name.equals(dog2.name));    //true
        System.out.println(dog1.says == dog2.says);     //true
        dog1 = dog2;
        System.out.println(dog1 == dog2);       //true
        dog1.name = "哈哈2";
        System.out.println(dog1.name+dog2.name);    //哈哈2哈哈2
    }
}
