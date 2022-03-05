import java.util.Scanner;
/**
 * basamakSayisi
 */
public class basamakSayisi {

  public static void main(String[] args) {
    int asilSayi, bSaiyisi = 0, bDegeri, total = 0; 
    
    Scanner take = new Scanner(System.in);

    System.out.print("Bir Sayı Giriniz: ");
    asilSayi = take.nextInt();

    //Geçici bir sayıya asıl sayıyı yani girilen sayıyı atıyoruz.
    int geciciSayi = asilSayi;

    // Basam Sayısı bulma
    while (geciciSayi != 0){
    // Bir sayıyı 10'a bölümünden kalan sayıyı yani yeni sayıyı bu gecici sayıya atıyoruz, kaç kere 10'a bölünürse o kadar basamak sayısı tespiti yapılmış oluyor.
      geciciSayi /=10;
      bSaiyisi++;
    // Yukarıdaki aslında bir counter şeklinde düşünebiliriz, bu counter kaç kere bölündüğünü gösteriyor yani basamak sayısını.
    }

    //Son Basamağı Bulma
    geciciSayi = asilSayi;
    //Yukarıdaki atamayı tekrar yapmak önemli (Geçici sayıya asıl sayıyı yani kullanıcının girdiği sayıyı tekrar atıyoruz.)
    //Aşağıda ilk önce basamak sayısı kadar döndürme işlemi yani döngü işlemi yapmamız gerekiyor.
    for (int i = 1; i <= bSaiyisi ; i++){

    //bDegeri aslında sayının son rakamını temsil ediyor, bir sayının 10'a bölümünden kalan sayı her zaman son rakamdır, son basamaktır.
      bDegeri = geciciSayi % 10;

    //Basamakları Toplama
      total += bDegeri;
      geciciSayi /=10; //Toplama yapıyoruz daha sonra 10'a bölüp en sondan bir rakam azaltmış oluyoruz ya işte bu yeni sayıyı geçici sayıya atayıp döngüleştirmiş oluyoruz.
    }
    System.out.println(total); 


    take.close();
  }
}