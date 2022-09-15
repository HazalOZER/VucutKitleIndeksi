import java.util.Scanner;

public class VucutKitleInd {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz: ");
        double kilo= scan.nextDouble();
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        double boy= scan.nextDouble();
        double vKitleInd= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vKitleInd);
    }
}
