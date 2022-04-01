package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dersler= new Scanner(System.in);
        int fizik,muzik,matematik,kimya,tarih,turkce;

        System.out.println("Fizik dersine ait notunuzu giriniz; ");
        fizik= dersler.nextInt();

        System.out.println("müzik dersine ait notunuzu giriniz; ");
        muzik= dersler.nextInt();

        System.out.println("matematik dersine ait notunuzu giriniz; ");
        matematik=dersler.nextInt();

        System.out.println("kimya dersine ait notunuzu giriniz");
        kimya= dersler.nextInt();

        System.out.println("tarih dersine ait notunuzu giriniz");
        tarih= dersler.nextInt();

        System.out.println("türkçe dersine ait notunuzu giriniz");
        turkce= dersler.nextInt();

        int toplam = fizik+muzik+matematik+kimya+tarih+turkce;
        double ort= toplam/6;
        boolean kosul1 =ort >= 60;
       boolean sonuc= (kosul1==true);
       String cıktı = sonuc? "sınıfı geçtiniz": "kaldınız";
        System.out.println(cıktı);







    }
}
