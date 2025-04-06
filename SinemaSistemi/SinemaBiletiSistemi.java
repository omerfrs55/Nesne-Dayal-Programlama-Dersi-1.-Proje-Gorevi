import java.util.Scanner;

public class SinemaBiletiSistemi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        String[] filimler = new String[10]; // En fazla 10 film girebiliriz
        int filmSayisi = 0; // Girilen film sayısını tutuyoruz

        String[] musteriler = new String[20]; // En fazla 20 müşteri girebiliriz
        String[] emailler = new String[20];   // Müşterilerin e-posta adreslerini tutuyoruz
        int musteriSayisi = 0; // Girilen müşteri sayısını tutuyoruz

        String[] biletfilimler = new String[100]; // Biletlerdeki filmlerin adlarını tutuyoruz
        String[] biletMusteriler = new String[100]; // Biletlerdeki müşterilerin bilgilerini tutuyoruz
        int biletSayisi = 0; // Bilet sayısını tutuyoruz

        int secim; // Menüden yapacağımız seçimi tuttuk

        do {
            System.out.println("\n--- Sinema Bilet Sistemi ---");
            System.out.println("1 - Film Ekle");
            System.out.println("2 - Müşteri Ekle");
            System.out.println("3 - Bilet Kaydı Oluştur");
            System.out.println("4 - Filmleri Listele");
            System.out.println("5 - Müşterileri Listele");
            System.out.println("6 - Biletleri Listele");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim yapınız: ");
            secim = giris.nextInt();
            giris.nextLine(); // Kullanıcı 3 yazıp Enter’a bastığında aslında: 3\n girer. Yani sayıdan sonra Enter tuşu (yeni satır) da geliyor. Ama nextInt() sadece sayıyı alıp, Enter’ı bırakıyor.

            System.out.println(); // Menümüz ile işlem çıktımız arasında boşluk bırakmak için

            if (secim == 1) {
                if (filmSayisi < 10) {
                    System.out.print("Film adı: ");
                    filimler[filmSayisi] = giris.nextLine(); // Film adını alıyoruz
                    filmSayisi++; // Film sayısını arttırıyoruz
                    System.out.println("Film eklendi.");
                } else {
                    System.out.println("Film sınırına ulaşıldı (maksimum 10).");
                }
            }

            else if (secim == 2) {
                if (musteriSayisi < 20) {
                    System.out.print("Müşteri adı: ");
                    musteriler[musteriSayisi] = giris.nextLine(); // Müşteri adını alıyoruz
                    System.out.print("E-posta: ");
                    emailler[musteriSayisi] = giris.nextLine(); // E-postasını alıyoruz
                    musteriSayisi++; // Müşteri sayısını arttırıyoruz
                    System.out.println("Müşteri eklendi.");
                } else {
                    System.out.println("Müşteri sınırına ulaşıldı (maksimum 20).");
                }
            }

            else if (secim == 3) {
                // Bilet Kaydı Oluşturma Kısmımız:
                if (filmSayisi == 0 || musteriSayisi == 0) {
                    System.out.println("Önce film ve müşteri eklemelisiniz.");
                } else {
                    // Mevcut filmlerimizi listeleyebilmemiz için:
                    System.out.println("--- Mevcut filimler ---");
                    for (int i = 0; i < filmSayisi; i++) {
                        System.out.println(i + " - " + filimler[i]);
                    }

                    System.out.print("Film numarası: ");
                    int filmNo = giris.nextInt(); // Seçilen film numaramız
                    giris.nextLine(); // Enter temizliği için

                    if (filmNo >= 0 && filmNo < filmSayisi) {
                        // Müşterilerimizi listeleyebilmemiz için:
                        System.out.println("--- Müşteriler ---");
                        for (int i = 0; i < musteriSayisi; i++) {
                            System.out.println(i + " - " + musteriler[i] + " | " + emailler[i]);
                        }

                        System.out.print("Müşteri numarası: ");
                        int musteriNo = giris.nextInt(); // Seçilen müşteri numaramız
                        giris.nextLine();

                        if (musteriNo >= 0 && musteriNo < musteriSayisi) {
                            // Bilet bilgilerini kaydedebilmek için:
                            biletfilimler[biletSayisi] = filimler[filmNo]; // Filmin adı
                            biletMusteriler[biletSayisi] = musteriler[musteriNo] + " (" + emailler[musteriNo] + ")"; // Müşterinin bilgisi
                            biletSayisi++; // Bilet sayısını arttırıyoruz
                            System.out.println("Bilet başarıyla kaydedildi.");
                        } else {
                            System.out.println("Geçersiz müşteri numarası.");
                        }
                    } else {
                        System.out.println("Geçersiz film numarası.");
                    }
                }
            }

            else if (secim == 4) {
                // Filmlerimizi Listeleyebilmek için:
                if (filmSayisi == 0) {
                    System.out.println("Henüz film eklenmedi.");
                } else {
                    System.out.println("--- Mevcut filimler ---");
                    for (int i = 0; i < filmSayisi; i++) {
                        System.out.println((i + 1) + ". " + filimler[i]);
                    }
                }
            }

            else if (secim == 5) {
                // Müşterilerimizi Listeleyebilmek için:
                if (musteriSayisi == 0) {
                    System.out.println("Henüz müşteri eklenmedi.");
                } else {
                    System.out.println("--- Kayıtlı Müşteriler ---");
                    for (int i = 0; i < musteriSayisi; i++) {
                        System.out.println((i + 1) + ". " + musteriler[i] + " | " + emailler[i]);
                    }
                }
            }

            else if (secim == 6) {
                // Biletleri Listeleyebilmek için:
                if (biletSayisi == 0) {
                    System.out.println("Henüz bilet kaydı yok.");
                } else {
                    System.out.println("--- Satılan Biletler ---");
                    for (int i = 0; i < biletSayisi; i++) {
                        System.out.println((i + 1) + ". " + biletMusteriler[i] + " -> " + biletfilimler[i]);
                    }
                }
            }

            else if (secim != 0) {
                // Geçersiz bir seçim söz konusu olursa:
                System.out.println("Geçersiz seçim yapıldı.");
            }

        } while (secim != 0); // Kullanıcı çıkış yapana kadar işlem yapmaya eder

        System.out.println("Sinema Sistemimizden çıkış yaptınız. İyi günler dileriz!");
    }
}
