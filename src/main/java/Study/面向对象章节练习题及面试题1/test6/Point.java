package Study.面向对象章节练习题及面试题1.test6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double getPointDistance(){
        return Math.sqrt(((x*x)+(y*y)));
    }

    public void show(){
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
        Point p = new Point(0,2);
        System.out.println(p.getPointDistance());
    }


}
