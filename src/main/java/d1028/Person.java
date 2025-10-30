package d1028;

public class Person {
    private String name;
    private int gender;
    private int age;

    // 构造方法
    public Person(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // 无参时的构造方法
    public Person() {
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender == 1 ? "男" : "女";
    }

    public int getAge(){
        return age;
    }

    public String getInfo(){
        return name + "今年" + age + "岁了";
    }
}

