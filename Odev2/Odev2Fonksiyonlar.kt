package com.example.myapplication.odev


    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    /**
     * Parametre olarak girilen kısa ve uzun kenara göre dikdörtgenin çevresini hesaplar.
     * Çevre = 2 * (kısa kenar + uzun kenar)
     * @param kisaKenar Dikdörtgenin kısa kenarı.
     * @param uzunKenar Dikdörtgenin uzun kenarı.
     * @return Dikdörtgenin çevresi.
     */
    fun dikdortgenCevre(kisaKenar: Double, uzunKenar: Double): Double {
        return 2 * (kisaKenar + uzunKenar)
    }

    /**
     * Parametre olarak girilen sayının faktöriyel değerini hesaplar.
     * @param sayi Faktöriyeli hesaplanacak negatif olmayan tamsayı.
     * @return Sayının faktöriyel değeri (Long tipi, büyük sayılar için). 0 için 1 döner.
     *         Negatif sayılar için -1 döner (hata durumu).
     */
    fun faktoriyelHesapla(sayi: Int): Long {
        if (sayi < 0) {
            println("Hata: Faktöriyel negatif sayılar için tanımlı değildir.")
            return -1L // Hata kodu olarak -1 Long dönebiliriz.
        }
        if (sayi == 0) {
            return 1L
        }
        var sonuc: Long = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    /**
     * Parametre olarak girilen kelime içinde kaç adet 'a' veya 'A' harfi olduğunu sayar.
     * @param kelime İçinde harf sayılacak metin.
     * @return Kelimedeki 'a' veya 'A' harfi sayısı.
     */
    fun aHarfiSay(kelime: String): Int {
        var sayac = 0
        // Harf karşılaştırmasını kolaylaştırmak için kelimeyi küçük harfe çevirelim
        val kucukKelime = kelime.lowercase()
        for (harf in kucukKelime) {
            if (harf == 'a') {
                sayac++
            }
        }
        // Alternatif (daha Kotlin tarzı):
        // return kelime.count { it.equals('a', ignoreCase = true) }
        return sayac
    }


// --- İkinci Görseldeki Fonksiyonlar ---

    /**
     * Parametre olarak girilen kenar sayısına göre çokgenin iç açılar toplamını hesaplar.
     * İç açılar toplamı = (Kenar sayısı - 2) * 180
     * @param kenarSayisi Çokgenin kenar sayısı (en az 3 olmalı).
     * @return İç açılar toplamı. Kenar sayısı 3'ten küçükse 0 döner.
     */
    fun icAcilarToplami(kenarSayisi: Int): Int {
        if (kenarSayisi < 3) {
            println("Hata: Kenar sayısı en az 3 olmalıdır.")
            return 0 // Geçerli bir çokgen değilse 0 dönebiliriz.
        }
        return (kenarSayisi - 2) * 180
    }

    /**
     * Parametre olarak girilen gün sayısına göre *temel* maaş hesabı yapar.
     * (Not: Sorudaki mesai detayı tam net olmadığı için sadece temel hesap yapılmıştır.)
     * Günlük çalışma: 8 saat. Saat ücreti: 10₺.
     * @param gunSayisi Çalışılan gün sayısı.
     * @return Hesaplanan maaş tutarı.
     */
    fun maasHesapla(gunSayisi: Int): Double {
        val gunlukCalismaSaati = 8
        val saatUcreti = 10.0 // Double olması çarpım sonucu için iyi
        // Mesai hesaplaması için ek bilgi (örn: ay içindeki toplam saat) gerektiğinden
        // şimdilik sadece temel maaş hesaplanıyor.
        if (gunSayisi < 0) {
            println("Hata: Gün sayısı negatif olamaz.")
            return 0.0
        }
        return gunSayisi * gunlukCalismaSaati * saatUcreti
    }

    /**
     * Parametre olarak girilen kota miktarına göre internet faturasını hesaplar.
     * 50 GB = 100 ₺
     * Kota aşımından sonra her 1 GB = 4 ₺
     * @param kotaGB Kullanılan internet kotası (GB cinsinden).
     * @return Toplam fatura ücreti.
     */
    fun kotaUcretiHesapla(kotaGB: Int): Double {
        if (kotaGB < 0) {
            println("Hata: Kota miktarı negatif olamaz.")
            return 0.0
        }
        val tabanKota = 50
        val tabanUcret = 100.0
        val asimUcretiGB = 4.0

        return if (kotaGB <= tabanKota) {
            tabanUcret
        } else {
            val asimMiktari = kotaGB - tabanKota
            tabanUcret + (asimMiktari * asimUcretiGB)
        }
    }
