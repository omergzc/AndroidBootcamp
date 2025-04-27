package com.omergezici.baslangic.nesne_tabanlı_programlama

fun main() {
    val f=Fonksiyonlar()
    //Unit=void
    f.Selamla1()
    //return
    val gelenSonuc=f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")
    f.selamla3("Salim")
    f.topla(2,3)
    f.topla(3.4,2.3)
}