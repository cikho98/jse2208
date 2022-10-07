package Study.面向对象章节练习题及面试题1.test2;

public class Account {
    private long cid;
    private String password;
    private double balance;

    public Account(long cid, String password, double balance) {
        this.cid = cid;
        this.password = password;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public String getInfo() {
        return "(" + cid + "," + balance + ")";
    }

    public boolean withdraw(String password, double money) {
        if (this.password.equals(password) ) {
            if (money >= balance) {
                balance -= money;
                System.out.println("取款成功");
                return true;
            } else {
                System.out.println("余额不足");
            }
        }
        System.out.println("密码错误");
        return false;
        }

    public boolean save(double money){
        balance+=money;
        System.out.println("存款成功");
        return true;
    }

}
