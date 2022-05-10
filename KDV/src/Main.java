import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tutar ;
        double fiyat, oranı;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ürünün Fiyatını Giriniz");
        tutar = scan.nextInt();
        if (tutar <= 1000) {
            fiyat= tutar +(tutar* 0.18);
            System.out.println("Ürünün KDVli yeni fiyatı : " + fiyat);
        }else if (tutar >1000){
            fiyat = tutar +(tutar *0.08);
            System.out.println("Ürünün KDVli yeni fiyat : " + fiyat);
        }

    }

}
