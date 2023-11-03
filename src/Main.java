import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i < sayi; i++) {
            if (i % 3 != 0 || i % 4 != 0) {
                continue;
            }

            toplam += i;
            adet++;

            System.out.println(i);
            if (i == sayi - 1)
            {
                break;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("0'dan " + sayi + "'e kadar olan sayılardan 3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
