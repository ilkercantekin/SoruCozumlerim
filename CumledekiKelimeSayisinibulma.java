package soru_Cozumlerim;

import java.util.Scanner;

public class CumledekiKelimeSayisinibulma {
    // Kullanicidan Bir cumle aliniz
    // verilen cumlede kac adet kelime bulundugunu hesaplayan bir kod yaziniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        int sayac=1;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' '){
                sayac++;
            }

        }
        System.out.println("Girilen cumlede "+sayac+" tane kelime bulunmaktadir");




    }
}