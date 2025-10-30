package d1028;

public class Man extends d1028.Person {

    public Man(String name, int age) {
        super(name, 1, age);
    }

    public Man() {
        super();
    }

    // Override 重写父类方法
    @Override
    public String getInfo() {
        return "男性" + getName() + "今年" + getAge() + "岁了";
    }
}
