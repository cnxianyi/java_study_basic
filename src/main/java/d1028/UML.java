package d1028;

import javax.swing.text.html.BlockView;
import java.util.ArrayList;
import java.util.List;

public class UML {
    public static void main(String[] args) {
        // ----- Generalization -----
        Dog Mike = new Dog();
        System.out.println(Mike.eat());

        // ----- Realization -----
        Bird Lovebird = new Bird();
        System.out.println(Lovebird.fly());

        // ----- Association -----
        Student S1 = new Student("s1");
        System.out.println(S1.name);

        Teacher T1 = new Teacher(S1);
        System.out.println(T1.student.name);

        // ----- Aggregation -----
        Employee E1 = new Employee("e1");
        System.out.println(E1.name);

        List<Employee> Elist = new ArrayList<Employee>();
        Elist.add(E1);

        Department1 D1 = new Department1(Elist);
        Department2 D2 = new Department2(Elist);

        D1 = null;
        System.out.println(D2.employees.getFirst().name);

        // ----- Composition -----

        // ----- Dependency -----
    }
}

/*
 * Generalization 泛化关系
 * 一个类是另一个类的父类
 * */

class Animal {
    public String eat() {
        return "eat";
    }
}

class Dog extends Animal {
    @Override
    public String eat() {
        return "Dog eat";
    }
}

/*
* Realization 实现关系
* 一个类实现了接口定义的方法
* */

interface Flyable {
    String fly();
}

class Bird implements Flyable {
    public String fly() {
        return "Bird fly";
    }
}

/*
* Association 关联关系
* 两个类之间有联系.但生命周期互相独立
* 如 一个类中有另一个类的引用
* */

class Teacher {
    Student student;
    public Teacher() {}
    public Teacher(Student student) {
        this.student = student;
    }
}

class Student {
    String name;
    public Student() {}
    public Student(String name) {
        this.name = name;
    }
}

/*
* Aggregation 聚合关系
* 整体与部分的关系,但是整体可以不存在
* */

class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}

class Department1 {
    List<Employee> employees;
    public Department1() {}
    public Department1(List<Employee> employees) {}
}

class Department2 {
    List<Employee> employees;
    public Department2() {}
    public Department2(List<Employee> employees) {
        this.employees = employees;
    }
}

/*
* Composition 组合关系
* 同样是整体-部分关系,但是部分的生命周期依赖于整体,不能独立存在
* TODO 待补充
* */

class House {

}

class Room {

}

/*
* Dependency 依赖关系
* 一个类临时使用另一个类
* TODO 待补充
* */