package com.example.myapplication.odev

// Main.kt

fun main() {
    println("--- Ödev 2 Fonksiyon Testleri ---")

    println("\n--- İlk Görsel ---")

    // 1. Celsius -> Fahrenheit
    val derece = 25.0
    val fahrenheit = celsiusToFahrenheit(derece)
    println("1. $derece derece = $fahrenheit Fahrenheit")

    // 2. Dikdörtgen Çevre
    val kisa = 10.5
    val uzun = 20.0
    val cevre = dikdortgenCevre(kisa, uzun)
    println("2. Kısa kenarı $kisa, uzun kenarı $uzun olan dikdörtgenin çevresi: $cevre")

    // 3. Faktöriyel
    val sayiFaktoriyel = 5
    val faktoriyelSonuc = faktoriyelHesapla(sayiFaktoriyel)
    if (faktoriyelSonuc != -1L) { // Hata kontrolü
        println("3. $sayiFaktoriyel! = $faktoriyelSonuc")
    }
    val negatifSayi = -3
    faktoriyelHesapla(negatifSayi) // Hata mesajı fonksiyon içinde yazdırılacak

    // 4. Harf Sayısı ('a')
    val kelime = "Adapazarı ve Ankara"
    val aSayisi = aHarfiSay(kelime)
    println("4. '$kelime' içinde $aSayisi adet 'a'/'A' harfi var.")


    println("\n--- İkinci Görsel ---")

    // 1. İç Açılar Toplamı
    val kenar = 5 // Beşgen
    val aciToplam = icAcilarToplami(kenar)
    if (aciToplam > 0) { // Hata kontrolü (kenar < 3 durumu)
        println("1. $kenar kenarlı çokgenin iç açılar toplamı: $aciToplam derece")
    }
    val gecersizKenar = 2
    icAcilarToplami(gecersizKenar) // Hata mesajı fonksiyon içinde yazdırılacak


    // 2. Maaş Hesaplama
    val gun = 22
    val maas = maasHesapla(gun)
    println("2. $gun gün çalışma için temel maaş: $maas ₺")

    // 3. Kota Ücreti Hesaplama
    val kota1 = 45 // Kota aşılmadı
    val ucret1 = kotaUcretiHesapla(kota1)
    println("3. $kota1 GB kota kullanımı için ücret: $ucret1 ₺")

    val kota2 = 70 // Kota aşıldı
    val ucret2 = kotaUcretiHesapla(kota2)
    println("3. $kota2 GB kota kullanımı için ücret: $ucret2 ₺")

    println("\n---------------------------------")
}