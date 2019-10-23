import java.util.Scanner;

public class TemelBilgiler {

	public static void main(String[] args) {
		// En temel veri tipleri:
		int tamSayı = 5;
		double ondalıkSayı = 0.456;
		boolean doğruMuYanlışMı = true; // Doğru ya da yanlış olma değerini gösterir.
		char karakter = 'b'; // Tek tırnak ile gösterilir
		String sayıDizisi = "Merhaba, CodeKAL"; // Yazı dizileri her zaman tırnak işareti içinde olmalıdır.

		// Temel operasyonlar
		int toplama = 5 + 3; // "+" toplama işlemi için kullanılır.
		int çıkartma = 3 - 2; // "-" çıkartma işlemi için kullanılır.
		int çarpma = 87 * 3; // "*" çarpma için kullanılır.
		int bölme = 96 / 4; // "/" bölme işleminde kullanılır.
		int kalan = 13 % 5; // "%" işlemin bölümünden kalan bulunur.

		// İki yazı dizesini "+" ile birbirlerine ekleyebilirisiniz.
		System.out.println("CodeKAl'ı " + "çok seviyorum.");

		System.out.println("toplama: " + toplama);
		System.out.println("çıkartma: " + çıkartma);
		System.out.println("çarpma: " + çarpma);
		System.out.println("bölme: " + bölme);
		System.out.println("kalan: " + kalan);

		// Girdi almak için ilk önce Scanner objesi oluşturun:
		Scanner scn = new Scanner(System.in);
		// Bir kere Scanner objesi oluşturduğunuzda aynı class içinde o objeyi bir daha
		// oluşturmadan birden fazla kez kullanabilirsiniz:
		// En sevdiğiniz sayının girdisini alın
		System.out.println("En sevdiğiniz sayıyı girin: ");
		int enSevdiğim = scn.nextInt();
		// En sevdiğiniz sayıyının çıktısını al
		System.out.println("En sevdiğim sayı = " + enSevdiğim);
		// Benim en sevdiğim sayının üç katı Ahmet'in en sevdiği sayıya eşittir:
		int ahmetEnSevdiği = enSevdiğim * 3;
		// Ahmet'in en sevdiği sayının çıktısını alınız:
		System.out.println("Ahmet'in en sevdiği sayı: " + ahmetEnSevdiği);

		// GÖREV: Yukarıda anlatılan bilgiler doğrultusunda aşağıdaki yönergeyi
		// uygulayınız.
		// ";" koymayı ihmal etmeyiniz.
		// İki tane sayı girdisi aslınız ve dört işlemi yapınız.
                int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		// Dört işlem yaptıktan sonra System.out.println(); ile çıktılarını alınız.
		
		
		scn.close();
	}

}
