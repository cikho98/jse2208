package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("./src/main/java/io");
        File[] files = dir.listFiles((file)->file.getName().endsWith(".java"));
        for (File file :files){
            FileInputStream fis = new FileInputStream(file);
            long len= file.length();
            byte[] data = new byte[(int)len];
            fis.read(data);
            String line = new String(data,StandardCharsets.UTF_8);
            data=line.getBytes(StandardCharsets.UTF_8);
            FileOutputStream fos = new FileOutputStream("./"+file.getName());
            fos.write(data);
            fos.close();
            fis.close();

        }
    }
}
