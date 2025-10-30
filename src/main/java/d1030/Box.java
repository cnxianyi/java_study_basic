package d1030;

/*
* 装箱与拆箱
* 在Java中,每个基本类型都有一个对应的包装类型
* 由于在Java中,集合里只能存储对象,不支持直接存储基本类型
* */
public class Box {
    public static void main(String[] args) {
        int i = 1; // 默认的赋值行为

        Integer I = 1; // 会自动装箱
        // 等同于
        I = Integer.valueOf(2);

        System.out.printf("%d %d\n" , i , I);

        // 将包装类型赋值给基本类型时,JVM会自动 拆箱
        int y = I; // 等同于
        y = I.intValue();
        System.out.printf("%d %d\n" , y , I);

        // 通过自动装拆箱机制,能方便的在集合中存储和读取 基本类型

        // 包装类型是不支持比较大,他们比较的是引用地址
        Integer I1 = 1;
        Integer I2 = 1;
        System.out.println(I1 == I2); // true Java8 对于-128~127的 Integer做了缓存

        Integer I3 = 128;
        Integer I4 = 128;
        System.out.println(I3 == I4); // false 无缓存时比较的就是引用地址

        System.out.println(I3.equals(I4)); // true 正确的比较

        Integer I5 = null;
        // 注意空指针
        // int I6 = I5; // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "I5" is null at d1030.Box.main(Box.java:37)

        // 缓存池
        // 已知 Java 8 中，Integer 缓存池的大小默认为 -128~127
        // valueOf() 则会自动判断是否存在缓存且使用
        // 而 new Integer() 则每次都会新建一个引用

        Integer I10 = 1;
        Integer I11 = Integer.valueOf(1);
        Integer I12 = new Integer(1); // 'Integer(int)' 自版本 9 起已弃用并标记为移除

        // true false false
        System.out.printf("自动装箱&缓存池:%b\n缓存池&新建:%b\n自动装箱&新建:%b\n" , I10 == I11 , I11 == I12 , I10 == I12);
    }
}
