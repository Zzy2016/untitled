package com.company;

import com.sun.jndi.toolkit.url.Uri;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {
    public static void main(String[] args) {
        try {
//            File file = new File("D:\\text.txt");
//            FileInputStream fileInputStream = new FileInputStream(file);
//            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
////            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
////            String line;
////            while ((line=bufferedReader.readLine())!=null){
////                System.out.println("===="+line);
////            }
//            char[] buffer = new char[2048];
////            int len=inputStreamReader.read(buffer);
//
//            while (inputStreamReader.read(buffer)!=-1){
//                int len=inputStreamReader.read(buffer);
//                System.out.println("------->"+new String(buffer,0,len));
//            }

            URL url = new URL("http://www.ifeng.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("accept", "*/*");
//            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 11; Windows NT 5.1)");
            connection.setRequestProperty("Content-Type","text/html");
            connection.connect();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            StringBuffer stringBuffer = new StringBuffer();
            if (connection.getResponseCode() == 200) {
                System.out.println("-------------1");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "GBK"));
                while (bufferedReader.readLine() != null) {
                    System.out.println(bufferedReader.readLine());
                    stringBuffer.append(bufferedReader.readLine());
                }

                System.out.println("===========" + stringBuffer.toString());
            } else {
                System.out.println("-------12------1" + connection.getResponseCode());
            }


        } catch (Exception e) {

        }
    }
}
