package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.nextLine();
        System.out.println("请输入密码");
        String password = scan.nextLine();
        System.out.println("请输入昵称");
        String niceName = scan.nextLine();
        System.out.println("请输入年龄");
        int age = scan.nextInt();

        User u = new User(username, password,niceName,age);

        FileOutputStream fos = new FileOutputStream(username+".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
        System.out.println("写入完成");




    }
}
