package Study.面向对象章节练习题及面试题1.test7;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void show(){
        System.out.println("我叫"+name+"性别："+gender+",今年"+age+"岁了");
    }

    public void eat(String food){
        System.out.println("正在吃"+food);
    }

    public static void main(String[] args) {
        Person p = new Person("刘德华","男",24);
        p.show();
        p.eat("饭");
    }


}
