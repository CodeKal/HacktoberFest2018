import java.util.Scanner;

public class LitreDönüştürücüCevap {

    public static void main(String[] args) {
        //Inputlarımızı alıyoruz.
         Scanner scn = new Scanner(System.in);
        //Dikdörtgenler prizmasının köşelerini cm cinsinden alıyoruz.
        System.out.println("Birinci  kenarı giriniz: ");
        int kenar1 = scn.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int kenar2 = scn.nextInt();
        System.out.println("Üçüncü kenarı giriniz: ");
        int kenar3 = scn.nextInt();
        //Hiçbir zaman scanner'ı kapatmayı unutma.
        scn.close();

        //GÖREV: Aşağıda eksik bırakılan yerleri tamamlayınız.
        //Prizmanın hacmini cm^3 cinsinden hesapladık.
        int hacimCM3 = kenar1 * kenar2 * kenar3;
        //Prizmanın hacmini litreye çevirdik.
        double hacimL = hacimCM3/1000;

        //Çıktılarımızı alınız.
            
       System.out.println("Hacmi(L):"+hacimL);

    }

}
