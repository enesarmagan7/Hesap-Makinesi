package Letcode;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int n1,n2,select;
        Scanner sc=new Scanner(System.in);

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen seçim yapınız: ");
        select=sc.nextInt();
        System.out.println("İlk Sayıyı giriniz: ");
        n1=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2=sc.nextInt();
switch (select){
    case 1:
        System.out.println("Toplam = "+(n1+n2));
        break;
    case 2:
        System.out.println("Çıkarma= "+(n1-n2));
        break;
    case 3:
        System.out.println("Çarpma: "+ (n1*n2));
        break;
    case 4:
        if(n2==0) {
            System.out.println("Bir sayı 0'a Bölünemez");
        }
        else {
            System.out.println("Bölme: " + (n1 / n2));
        }
        break;
    default:
        System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyin.");
}
    }
}
