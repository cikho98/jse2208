package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");
        FileInputStream fis = new FileInputStream(file);
        long len= file.length();
        byte[] data = new byte[(int)len];
        fis.read(data);
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();

    }
}
