package Study.面向对象章节练习题及面试题1.test1;

public class  Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "("+getName()+","+getAge()+")";
    }
}
