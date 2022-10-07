package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");
        File[] files = dir.listFiles((file)->file.getName().endsWith(".obj"));
        for (File file :files){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if (obj instanceof User){
                User u = (User) obj;
                System.out.println(u);
            }
            ois.close();

        }
        System.out.println("读写完成");
    }
}
