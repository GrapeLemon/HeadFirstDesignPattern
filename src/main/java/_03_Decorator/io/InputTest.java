package _03_Decorator.io;

import java.io.*;

/**
 * @author lwx
 * @date 2019/8/11-15:04
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));
            //注意 如果是涉及到File的话意味着是跟文件系统相关的，类路径那一套是不起作用的！
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
