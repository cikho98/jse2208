package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("请输入要查询的用户名称");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        File file = new File(name+".obj");
        int num=0;
        while (!(file.exists())){
            System.out.println("文件不存在，请重新输入确认");
            name = scanner.nextLine();
            file = new File(name+".obj");
            num++;
            if (num>3){
                break;
            }
        }
        if (file.exists()) {
            System.out.println("文件存在，正再读取中");
            FileInputStream fis = new FileInputStream(name+".obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User u  = (User)ois.readObject();
            System.out.println(u);
            ois.close();


        }
    }
}
