package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class test1 {
    public static void main(String[] args) {

        long time=System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
        System.out.println(simpleDateFormat.format(time));

    }
}
