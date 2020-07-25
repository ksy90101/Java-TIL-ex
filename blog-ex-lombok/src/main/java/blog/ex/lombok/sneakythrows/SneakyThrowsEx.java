package blog.ex.lombok.sneakythrows;

import java.io.UnsupportedEncodingException;

import lombok.SneakyThrows;

public class SneakyThrowsEx {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes){
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run(){
        throw new Throwable();
    }
}
