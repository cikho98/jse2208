package Study.面向对象章节练习题及面试题1.test4;

public class RoundDemo {
    private int width;
    private int heigt;

    public RoundDemo() {
    }

    public RoundDemo(int width, int heigt) {
        this.width = width;
        this.heigt = heigt;
    }

    public int getArea(){
        return width*heigt;
    }
}
