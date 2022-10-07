package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test3 {
    public static void main(String[] args) throws IOException {
//        创建目录对象，获取目录下文件
        File dir = new File("./src/main/java/io");
//        过滤器使用file.getname 再使用contanins过滤文件

        File[] files = dir.listFiles((file)->file.getName().endsWith(".java"));
        for (File file :files){
            FileInputStream fis = new FileInputStream(file);
            long len = file.length();
            byte[] data = new byte[(int)len];
            fis.read(data);
            String line = new String(data, StandardCharsets.UTF_8);
            System.out.println(line);
        }
    }
}
