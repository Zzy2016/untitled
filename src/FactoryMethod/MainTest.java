package FactoryMethod;

import java.text.DecimalFormat;

public class MainTest {
    public static void main(String[] args) {
//        Factory factory=new Factory1();
//        Product product=factory.createProduct();
        float length = 78.100033f;
        System.out.println(length%60);
        System.out.println((int)length/60);

        DecimalFormat decimalFormat=new DecimalFormat(".00");
        System.out.println(decimalFormat.format(length));
    }
}
