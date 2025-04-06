import java.util.Scanner;

public class SinemaBiletiSistemi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        String[] filimler = new String[10]; // En fazla 10 film girebiliriz
        int filmsayisi = 0; // Girilen film sayısını tutuyoruz

        String[] musteriler = new String[20]; // En fazla 20 müşteri girebiliriz
        String[] emailler = new String[20];   // Müşterilerin e-posta adreslerini tutuyoruz
        int musterisayisi = 0; // Girilen müşteri sayısını tutuyoruz

        String[] filimleradi = new String[100]; // Biletlerdeki filmlerin adlarını tutuyoruz
        String[] musteribilgi = new String[100]; // Biletlerdeki müşterilerin bilgilerini tutuyoruz
        int biletsayisi = 0; // Bilet sayısını tutuyoruz

        int secim; // Menüden yapacağımız seçimi tuttuk

        do {
            System.out.println("\n----- Sinema Bilet Sistemi -----");
            System.out.println("1 -- Film Ekle");
            System.out.println("2 -- Müşteri Ekle");
            System.out.println("3 -- Bilet Kaydı Oluştur");
            System.out.println("4 -- Filmleri Listele");
            System.out.println("5 -- Müşterileri Listele");
            System.out.println("6 -- Biletleri Listele");
            System.out.println("0 -- Sistemden Çıkış");
            System.out.print("Seçim yapınız: ");
            secim = giris.nextInt();
            giris.nextLine(); // Kullanıcı 3 yazıp Enter’a bastığında aslında: 3\n girer. Yani sayıdan sonra Enter tuşu yani yeni satır da geliyor. Ama nextInt() sadece sayıyı alıp, Enter’ı bırakıyor.

            System.out.println(); // Menümüz ile işlem çıktımız arasında boşluk bırakmak için

            if (secim == 1) {
                if (filmsayisi < 10) {
                    System.out.print("Film adı: ");
                    filimler[filmsayisi] = giris.nextLine(); // Film adını alıyoruz
                    filmsayisi++; // Film sayısını arttırıyoruz
                    System.out.println("Film eklendi.");
                } else {
                    System.out.println("Film sınırına ulaşıldı (maksimum 10).");
                }
            }

            else if (secim == 2) {
                if (musterisayisi < 20) {
                    System.out.print("Müşteri adı: ");
                    musteriler[musterisayisi] = giris.nextLine(); // Müşteri adını alıyoruz
                    System.out.print("E-posta: ");
                    emailler[musterisayisi] = giris.nextLine(); // E-postasını alıyoruz
                    musterisayisi++; // Müşteri sayısını arttırıyoruz
                    System.out.println("Müşteri eklendi.");
                } else {
                    System.out.println("Müşteri sınırına ulaşıldı (maksimum 20).");
                }
            }

            else if (secim == 3) {
                // Bilet Kaydı Oluşturma Kısmımız:
                if (filmsayisi == 0 || musterisayisi == 0) {
                    System.out.println("Önce film ve müşteri eklemelisiniz.");
                } else {
                    // Mevcut filmlerimizi listeleyebilmemiz için:
                    System.out.println("---- Mevcut filimler ----");
                    for (int i = 0; i < filmsayisi; i++) {
                        System.out.println(i + " - " + filimler[i]);
                    }

                    System.out.print("Film numarası: ");
                    int filimnumara = giris.nextInt(); // Seçilen film numaramız
                    giris.nextLine(); // Enter temizliği için

                    if (filimnumara >= 0 && filimnumara < filmsayisi) {
                        // Müşterilerimizi listeleyebilmemiz için:
                        System.out.println("---- Müşteriler ----");
                        for (int i = 0; i < musterisayisi; i++) {
                            System.out.println(i + " - Müşteri: " + musteriler[i] + " | Müşteri Email'i: " + emailler[i]);
                        }

                        System.out.print("Müşteri numarası: ");
                        int musterinumara = giris.nextInt(); // Seçilen müşteri numaramız
                        giris.nextLine();

                        if (musterinumara >= 0 && musterinumara < musterisayisi) {
                            // Bilet bilgilerini kaydedebilmek için:
                            filimleradi[biletsayisi] = filimler[filimnumara]; // Filmin adı
                            musteribilgi[biletsayisi] = musteriler[musterinumara] + " (" + emailler[musterinumara] + ")"; // Müşterinin bilgisi
                            biletsayisi++; // Bilet sayısını arttırıyoruz
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
                if (filmsayisi == 0) {
                    System.out.println("Henüz film eklenmedi.");
                } else {
                    System.out.println("---- Mevcut filimler ----");
                    for (int i = 0; i < filmsayisi; i++) {
                        System.out.println((i + 1) + ". " + filimler[i]);
                    }
                }
            }

            else if (secim == 5) {
                // Müşterilerimizi Listeleyebilmek için:
                if (musterisayisi == 0) {
                    System.out.println("Henüz müşteri eklenmedi.");
                } else {
                    System.out.println("---- Kayıtlı Müşteriler ----");
                    for (int i = 0; i < musterisayisi; i++) {
                        System.out.println((i + 1) + ". Müşteri: " + musteriler[i] + " | Müşteri Email'i: " + emailler[i]);
                    }
                }
            }

            else if (secim == 6) {
                // Biletleri Listeleyebilmek için:
                if (biletsayisi == 0) {
                    System.out.println("Henüz bilet kaydı yok.");
                } else {
                    System.out.println("---- Satılan Biletler ----");
                    for (int i = 0; i < biletsayisi; i++) {
                        System.out.println((i + 1) + ". " + musteribilgi[i] + " -> " + filimleradi[i]);
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
