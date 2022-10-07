package Study.面向对象章节练习题及面试题1.test5;

public class DogDemo {
    private String name;
    private String color;
    private int age;

    public DogDemo(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println(name+","+color+","+age);
    }

}
