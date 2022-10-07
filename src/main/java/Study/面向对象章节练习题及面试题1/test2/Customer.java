package Study.面向对象章节练习题及面试题1.test2;

public class Customer {
    private String name;
    private long idCard;
    private long number;
    private String address;

    public Customer(String name, long idCard, long number, String address) {
        this.name = name;
        this.idCard = idCard;
        this.number = number;
        this.address = address;
    }

    public String say(){
        return "("+name+","+idCard+","+number+","+address+")";
    }

}
