import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,sonuc,alan;


        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kanerı Giriniz : ");
        b = girdi.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextInt();
        sonuc = (a+b+c)/2;
        alan = sonuc*(sonuc-a)*(sonuc-b)*(sonuc-c);
        System.out.println("Üçgenin alanı: "+Math.sqrt(alan));
    }
}
