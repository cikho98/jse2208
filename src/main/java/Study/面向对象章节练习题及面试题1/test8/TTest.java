package Study.面向对象章节练习题及面试题1.test8;

public class TTest {
    public static void main(String[] args) {
        TTest t= new TTest();
        t.first();
    }

    private void first() {
        int i =5;
        Value v = new Value();
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(Value v,int i){
        i=0;
        v.i=20;
        Value val = new Value();
        v=val;
        System.out.println(v.i+" "+i);
    }
}
