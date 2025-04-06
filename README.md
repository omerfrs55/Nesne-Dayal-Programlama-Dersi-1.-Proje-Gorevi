# Sinema Bileti Sistemi - Java Konsol Uygulamam

Bu konsol uygulamasında bir sinema işletmesi için temel müşteri kaydı ve bilet işlemlerinin yapıldığı bir sistem geliştirdim:<p/>
- Kullanıcımız, konsol üzerinden film ve müşterilerin bilgilerini girerek bir bilet oluşturabilir ve kayıtları listeleyebilir.<p/>
- Ek olarak sistem üzerinden filmleri ve müşterileri listeleyebilir.<br/>

## Kullandığım Yapılar:
* Diziler (String[])
* for döngüsü
* if-else yapıları
* do-while döngüsü
* Scanner sınıfı (kullanıcıdan veri alabilmek için kullandım)

## Kodu Yazarken Nasıl Yazdığıma Dair:

**String dizileri kullanılarak;**
Filmler (`filimler[]`),
Müşteriler (`musteriler[]` ve `emailler[]`),
Biletler (`filimleradi[]` ve `musteribilgi[]`)i ayrı ayrı sakladım.

- Her kategori için ayrı ayrı sayaç değişkenlerini (filmsayisi, musteriSayisi, biletSayisi) oluşturup, dizilerin hangi indeksinde veri olduğu takip ettirdim.

- Programda kullanıcıyla etkileşim kurabilmek adına Scanner sınıfını kullandım.

- Menü yapısını do-while döngüleri ve if-else if yapısı ile oluşturdum.

- Kullanıcıdan alınan seçim değeriyle ilgili işlem belirledim.

- `nextLine()` metoduyla adı, soyadı, film adı gibi alanlarda boşluklu girişlerin tamamını aldırttım.

## Temel İşlemlerimiz:<br/>
**Film Ekleme:**<br/>
Kullanıcıdan film adını alıp `filimler[]` dizisine ekledim.
Film sayısını filmSayisi değişkeniyle takip ettirdim.

**Müşteri Ekleme:**<br/>
Müşteri adını ve e-postasını kullanıcıdan aldım.
Bunları `musteriler[]` ve `emailler[]` dizilerine ayrı ayrı ekledim.

**Bilet Kaydı Oluşturma:**<br/>
Önce film ve müşteri olup olmadığı kontrol ettiriyoruz.
Sonra kullanıcıdan film ve müşteri seçmesi istedim.
Ve ardından seçilen film ve müşteri bilgilerini `filimleradi[]` ve `musteribilgi[]` dizilerine kaydettim

**Veri Listeleme:**<br/>
Filmler, müşteriler ve biletler ayrı ayrı listeleledim.
Her listeleme işlemi için for döngüsü kullandım.

**Diğer Detaylar:**<br/>
Scanner nesnesi program sonunda bir kez kapattım. Çünkü her işlem sonunda ayrı ayrı kapatmam gerekcekti bu sayede gerek kalmadı.
Programım, kullanıcı 0 seçeneğini girene kadar sürekli olarak çalışmaya devam ediyor.

**Not:**<br/>
- Maksimum sınırlar: 10 film, 20 müşteri, 100 bilet.


## **Kodun Sahibi ve Proje Hakkında Bilgi:**<br/>

**Hazırlandığı Uygulama:** Visual Studio Code<br/>
**Adı:** Ömer Faruk<br/>
**Soyadı:** SAĞLAM<br/>
**Okul Numarası:** 20230108011<br/>
**Üniversite Adı:** Piri Reis Üniversitesi<br/>
**Bölüm Adı:** Bilgisayar Programcılığı<br/>
**Öğretmen Adı:** Emrah SARIÇİÇEK<br/>
**Ders Adı:** Nesne Dayalı Programlama<br/>
**Proje Adı:** Sinema Bilet Sistemi /// Java Konsol Uygulaması<br/>
