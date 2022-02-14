package com.chen;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class Base64Test {
    public static void main(String[] args) {

        String url="https://www.baidu.com";

        System.out.println("url:"+url);
//        标准的Base64编码和解码
        System.out.println(url.getBytes(StandardCharsets.UTF_8));

        byte[] encoded=Base64.getEncoder().encode(url.getBytes(StandardCharsets.UTF_8));

        System.out.println("url编码:"+ new String(encoded));

        byte[] decoded=Base64.getDecoder().decode(encoded);

        System.out.println("url解码:"+ new String(decoded));

//        url 安全的 Base64 编码 解码
        byte[] encoded2=Base64.getUrlEncoder().encode(url.getBytes(StandardCharsets.UTF_8));

        System.out.println("Base64 encoded:" + new String(encoded2));

        byte[] decoded2 = Base64.getUrlDecoder().decode(encoded2);

        System.out.println("Base64 decoded:" + new String(decoded2));



    }
}
