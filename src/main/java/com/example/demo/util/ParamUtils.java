package com.example.demo.util;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.net.URLCodec;

import java.nio.charset.Charset;

/**
 * Created by liumin5 on 2017/9/17.
 */
public class ParamUtils {

    public static String encodeUrl(String data){
        return StringUtils.newStringUtf8(URLCodec.encodeUrl(null, data.getBytes(Charset.defaultCharset())));
    }
}
