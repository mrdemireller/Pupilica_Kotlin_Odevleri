package com.example.myapplication.odev

fun main() {
    // 1. Sütun Değişkenleri
    val sehir: String = "İstanbul"
    val ulke: String = "Türkiye"
    val telefon: String = "+90 555 123 45 67"
    val postaKodu: String = "06500"
    val email: String = "ornek@email.com"
    val meslek: String = "Mühendis"
    val stokMiktari: Int = 150
    val musteriAdi: String = "Ali Veli"
    val bakiye: Double = 1578.50
    val dogumGunu: String = "15.08.1995" // Tarihleri String olarak tutmak basit bir yaklaşım
    val maas: Double = 31000.0
    val medeniDurum: String = "Bekar"
    val urunYorum: String = "Ürün beklentilerimi karşıladı, tavsiye ederim."

    // 2. Sütun Değişkenleri
    val odemeTarihi: String = "22.09.2025"
    val odeme: Double = 299.99
    val siparisAdeti: Int = 5
    val arabaModeli: String = "Ford Focus"
    val kitapAdi: String = "Kotlin ile Programlamaya Giriş"
    val yayinlamaTarihi: String = "01.03.2024"
    val indirimMiktari: Double = 25.50
    val odaSayisi: Int = 3
    val enlem: Double = 39.925533
    val boylam: Double = 32.866287
    val urunAdi: String = "Kablosuz Kulaklık"
    val yemekFiyati: Double = 185.0

    // 3. Sütun Değişkenleri
    val marka: String = "Apple"
    val muzikAdi: String = "Imagine Dragons - Believer"
    val videoSuresi: String = "00:03:24" // Süreyi String olarak tutmak
    val urunPuani: Float = 4.7f // Puanlar için Float veya Double kullanılabilir
    val resimAdi: String = "profil_resmi.png"
    val dosyaFormati: String = "PDF"
    val renk: String = "Kırmızı"
    val renkKodu: String = "#FF0000"
    val telefonModeli: String = "iPhone 15 Pro"
    val ekranBoyutu: Double = 6.1
    val agirlik: Double = 187.0

    // 4. Sütun Değişkenleri
    val ulusalGun: String = "23 Nisan Ulusal Egemenlik ve Çocuk Bayramı"
    val tatilGunu: String = "01 Mayıs Emek ve Dayanışma Günü"
    val rezervasyonTarihi: String = "10.06.2025"
    val sokakAdi: String = "Atatürk Bulvarı"
    val otobusHatti: String = "EGO 413"
    val kalanDakika: Int = 62
    val takipKodu: String = "KARGO12345TR"
    val kuponSuresi: String = "30 gün" // Süre ifadesini String olarak tutmak
    val kuponKodu: String = "HAR2025"
    val faturaAdresi: String = "Örnek Mahallesi, Test Sokak No: 1 Daire: 5 Çankaya/Ankara"

    // Değişkenleri Yazdırma
    println("--- Ödev 1 Değişken Çıktıları ---")

    println("\n--- 1. Sütun ---")
    println("Şehir: $sehir")
    println("Ülke: $ulke")
    println("Telefon: $telefon")
    println("Posta Kodu: $postaKodu")
    println("Email: $email")
    println("Meslek: $meslek")
    println("Stok Miktarı: $stokMiktari")
    println("Müşteri Adı: $musteriAdi")
    println("Bakiye: $bakiye TL")
    println("Doğum Günü: $dogumGunu")
    println("Maaş: $maas TL")
    println("Medeni Durum: $medeniDurum")
    println("Ürün Yorum: $urunYorum")

    println("\n--- 2. Sütun ---")
    println("Ödeme Tarihi: $odemeTarihi")
    println("Ödeme: $odeme TL")
    println("Sipariş Adeti: $siparisAdeti")
    println("Araba Modeli: $arabaModeli")
    println("Kitap Adı: $kitapAdi")
    println("Yayınlama Tarihi: $yayinlamaTarihi")
    println("İndirim Miktarı: $indirimMiktari TL")
    println("Oda Sayısı: $odaSayisi")
    println("Enlem: $enlem")
    println("Boylam: $boylam")
    println("Ürün Adı: $urunAdi")
    println("Yemek Fiyatı: $yemekFiyati TL")

    println("\n--- 3. Sütun ---")
    println("Marka: $marka")
    println("Müzik Adı: $muzikAdi")
    println("Video Süresi: $videoSuresi")
    println("Ürün Puanı: $urunPuani / 5.0")
    println("Resim Adı: $resimAdi")
    println("Dosya Formatı: $dosyaFormati")
    println("Renk: $renk")
    println("Renk Kodu: $renkKodu")
    println("Telefon Modeli: $telefonModeli")
    println("Ekran Boyutu: $ekranBoyutu inç")
    println("Ağırlık: $agirlik gr")

    println("\n--- 4. Sütun ---")
    println("Ulusal Gün: $ulusalGun")
    println("Tatil Günü: $tatilGunu")
    println("Rezervasyon Tarihi: $rezervasyonTarihi")
    println("Sokak Adı: $sokakAdi")
    println("Otobüs Hattı: $otobusHatti")
    println("Kalan Dakika: $kalanDakika dk")
    println("Takip Kodu: $takipKodu")
    println("Kupon Süresi: $kuponSuresi")
    println("Kupon Kodu: $kuponKodu")
    println("Fatura Adresi: $faturaAdresi")

    println("\n-----------------------------------")
}