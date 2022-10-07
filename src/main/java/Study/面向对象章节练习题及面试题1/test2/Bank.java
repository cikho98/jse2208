package Study.面向对象章节练习题及面试题1.test2;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(4265464l,"741852",555);
        Customer cust = new Customer("刘德华",54654l,545466,"广州");

        account.save(54650);
        System.out.println(cust.say());

    }
}
