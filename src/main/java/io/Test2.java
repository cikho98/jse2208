package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner scan  = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt",true);
        while (true){
            System.out.println("请输入文字： ");
            String str =scan.nextLine();
            if ("exits".equals(str)){
                System.out.println("程序结束");
                break;
            }else {
                byte[] data= str.getBytes(StandardCharsets.UTF_8);
                fos.write(data);
                fos.flush();
            }
        }
        fos.close();
    }
}
