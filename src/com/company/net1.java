package com.company;

import java.net.CacheRequest;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class net1 {
    public static void main(String[] args) {
//        try {
//            String path = "https://www.baidu.com/baidu?tn=monline_3_dg&ie=utf-8&wd=%E8%8F%9C%E9%B8%9F%E6%95%99%E7%A8%8B";
//            URL url = new URL(path);
//
//        } catch (Exception e){
//
//        }
        String str = "  1  ";
        String reg = "^\\s*$";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher=pattern.matcher(str);
        System.out.println(matcher.matches()+"----");
    }
}
