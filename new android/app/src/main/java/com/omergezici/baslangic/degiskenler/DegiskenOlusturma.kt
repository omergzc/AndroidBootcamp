package com.omergezici.baslangic.degiskenler
fun main(){
    var id=1
    var ad="Mont"
    var resim="mont.png"
    var puan=4.7
    var fiyat=4500
    var stokdurum=true

    println("Id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stokdurum : $stokdurum")
    // Sabitler - Constant
    var  sayi=30
    sayi=100
    println(sayi)
    val numara=50
    println(numara)
    //Tür dönüşümü
    //sayısaldan sayısala dönüşüm
    val d :Int=45
    val sonuc1=d.toInt()
    println(sonuc1)
    val yazi="48T"
    val sonuc4 = yazi.toIntOrNull()
    println(sonuc4)
}
