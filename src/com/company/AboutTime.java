package com.company;

import sun.awt.geom.AreaOp;
import sun.rmi.runtime.Log;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.ExportException;
import java.util.Date;

import static jdk.nashorn.internal.runtime.PropertyDescriptor.GET;

public class AboutTime {


    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getTime());
//
//        System.currentTimeMillis();
//        date.setTime(System.currentTimeMillis());
//        System.out.println(date.toString());

//        String path = "";
//        try {
//            URL url = new URL(path);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            httpURLConnection.setRequestMethod(GET);
//            httpURLConnection.connect();
//            FileInputStream fileInputStream = (FileInputStream) httpURLConnection.getInputStream();
//            StringBuffer stringBuffer = new StringBuffer();
//            byte[] read = new byte[1024];
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {
            File file = new File("D:\\login.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
//            根据read方法 一个字节一个字节的读取
            while (fileInputStream.read() != -1) {
                System.out.println((char) fileInputStream.read());
            }

//            使用数组 一次读取多个
            int length = 0;
            byte[] bytes = new byte[1024];
            while ((length = fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, length));
            }

//            使用转换器 读取
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            String str;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }

            fileInputStream.close();

            String text = "Reads a subarray as a sequence of bytes.\n" +
                    "@param b the data to be written\n" +
                    "@param off the start offset in the data\n" +
                    "@param len the number of bytes that are written\n" +
                    "@exception IOException If an I/O error has occurred.";
            byte[] bytes1 = text.getBytes();
//
            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write(bytes1);


            Writer writer=new OutputStreamWriter(fileOutputStream);
            writer.write("这是一个测hi是");
            writer.close();



        } catch (Exception e) {

        }
    }
}
