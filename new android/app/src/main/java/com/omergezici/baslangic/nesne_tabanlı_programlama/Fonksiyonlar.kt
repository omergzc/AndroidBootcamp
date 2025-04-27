package com.omergezici.baslangic.nesne_tabanlı_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan
    fun Selamla1(){ //Swift->func
    val sonuc="Merhaba Ahmet"
    println(sonuc)
    }
    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2():String{
        val sonuc ="Merhaba Ahmet"
        return sonuc
    }
    fun selamla3(isim : String){
        val sonuc ="Merhaba $isim"
        println(sonuc)
    }
    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak için
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplama : ${sayi1+sayi2}")


    }
    fun topla(sayi1:Double,sayi2:Double){
        println("Toplama : ${sayi1+sayi2}")
}}