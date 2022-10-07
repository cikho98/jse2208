package Study.面向对象章节练习题及面试题1.参数传递.test6;

import java.util.Arrays;

public class BufferSort {
    public static void main(String[] args) {
        int[] array = {3,2,5,1,7};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int old = array[j];
                    array[j]=array[j+1];
                    array[j+1]=old;

                }

            }
            System.out.println(Arrays.toString(array));
        }
    }
}
