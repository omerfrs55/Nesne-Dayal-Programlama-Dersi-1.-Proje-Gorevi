Sinema Bilet Sistemi - Java Konsol Uygulamam

Bu konsol uygulamasında bir sinema işletmesi için temel müşteri kaydı ve bilet işlemlerinin yapıldığı bir sistem geliştirdim:
---Kullanıcımız, konsol üzerinden film ve müşterilerin bilgilerini girerek bir bilet oluşturabilir ve kayıtları listeleyebilir.
---Ek olarak sistem üzerinden filmleri ve müşterileri listeleyebilir.

Kullandığım Yapılar:
* Diziler (String[])
* for döngüsü
* if-else yapıları
* do-while döngüsü
* Scanner sınıfı (kullanıcıdan veri alabilmek için kullandım)

Kodu yazarken nasıl yazdığıma dair:

*String dizileri kullanılarak;
Filmler (filimler[]),
Müşteriler (musteriler[] ve emailler[]),
Biletler (biletFilimler[] ve biletMusteriler[])i ayrı ayrı sakladım.

*Her kategori için ayrı ayrı sayaç değişkenlerini (filmSayisi, musteriSayisi, biletSayisi) oluşturup, dizilerin hangi indeksinde veri olduğu takip ettirdim.

*Programda kullanıcıyla etkileşim kurabilmek adına Scanner sınıfını kullandım.

*Menü yapısını do-while döngüleri ve if-else if yapısı ile oluşturdum.

*Kullanıcıdan alınan seçim değeriyle ilgili işlem belirledim.

*nextLine() metoduyla adı, soyadı, film adı gibi alanlarda boşluklu girişlerin tamamını aldırttım.

--Temel İşlemlerimiz--
Film Ekleme:
Kullanıcıdan film adını alıp filimler[] dizisine ekledim.
Film sayısını filmSayisi değişkeniyle takip ettirdim.

Müşteri Ekleme:
Müşteri adını ve e-postasını kullanıcıdan aldım.
Bunları musteriler[] ve emailler[] dizilerine ayrı ayrı ekledim.

Bilet Kaydı Oluşturma:
Önce film ve müşteri olup olmadığı kontrol ediyoruz.
Sonra kullanıcıdan film ve müşteri seçmesi istedim.
Ve ardından seçilen film ve müşteri bilgilerini biletFilimler[] ve biletMusteriler[] dizilerine kaydettim

Veri Listeleme:
Filmler, müşteriler ve biletler ayrı ayrı listeleledim.
Her listeleme işlemi için for döngüsü kullandım.

Diğer Detaylar
Scanner nesnesi program sonunda bir kez kapattım. Çünkü her işlem sonunda ayrı ayrı kapatmam gerekcekti bu sayede gerek kalmadı.
Programım, kullanıcı 0 seçeneğini girene kadar sürekli olarak çalışmaya devam ediyor.

Bazı Notlarım:
- Tüm veriler dizilerle tutulmuştur.
- Maksimum sınırlar: 10 film, 20 müşteri, 100 bilet.


Kodun Sahibi ve Proje Hakkında Bilgi:

Hazırlandığı Uygulama: Visual Studio Code
Adı: Ömer Faruk
Soyadı: SAĞLAM
Okul Numarası: 20230108011
Üniversite Adı: Piri Reis Üniversitesi
Bölüm Adı: Bilgisayar Programcılığı
Öğretmen Adı: Emrah SARIÇİÇEK
Ders Adı: Nesne Dayalı Programlama
Proje Adı: Sinema Bilet Sistemi /// Java Konsol Uygulaması