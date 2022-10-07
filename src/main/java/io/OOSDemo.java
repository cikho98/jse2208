package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "世豪";
        int age = 24;
        String gender="男";
        String[] otherInfo = {"人好","帅哥","很屌"};

        Person p = new Person(name,age,gender,otherInfo);

        FileOutputStream fos  = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("写入完成");
        oos.close();

    }
}
