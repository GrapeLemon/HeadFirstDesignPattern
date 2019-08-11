package _03_Decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lwx
 * @date 2019/8/11-14:56
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        //复用InputSteam 的 read 方法，感觉IO操作其实和底层深度相关,只是java帮我们做了很多抽象
        int c =super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b,int offset,int len) throws IOException {
        int result = super.read(b,offset,len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
