package Study.面向对象章节练习题及面试题1.test1;

public class Test {
    public static void main(String[] args) {
        Husband hus = new Husband("刘德华",25);

        Wife wife = new Wife("wife",25);
        System.out.println(wife.getInfo());
        System.out.println(hus.getInfo());

    }
}
