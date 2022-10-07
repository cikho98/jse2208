package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
//        输入低级流水
        FileInputStream fis = new FileInputStream("image.png");
//        输入高级流
        BufferedInputStream bis  = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("image_cp.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long start = System.currentTimeMillis();
        int d ;
        while((d=bis.read()) != -1) {
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"ms");
        bis.close();
        bos.close();


    }
}
