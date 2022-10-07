package io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "爱你孤身走暗巷子";


        bos.write(str.getBytes(StandardCharsets.UTF_8));
        bos.flush();
        bos.close();

    }
}
