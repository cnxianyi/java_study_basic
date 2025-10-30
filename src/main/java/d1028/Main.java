package d1028;

public class Main {
    public static void main(String[] args) {
        Person Ming = new Person("Ming" , 0 ,18);
        System.out.println(Ming.getInfo());
        System.out.println(Ming.getName());

        Man L = new Man("劳大" , 18);
        System.out.println(L.getInfo());
        System.out.println(L.getName());

        // 多态
        // 子类是父类的扩展，不能反向缩小,只能父类调用子类，而不是子类反向调用父类
        // 1. 父调父
        // 2. 父调子
        Person L1 = new Man("劳二" , 19);
        System.out.println(L1.getInfo());
        // 3. 子调子
    }
}