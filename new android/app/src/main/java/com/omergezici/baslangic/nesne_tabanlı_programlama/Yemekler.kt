package com.omergezici.baslangic.nesne_tabanlı_programlama

data class Yemekler(var id:Int,var ad :String,var fiyat:Int) {
    init{
        println("Nesne Oluştu")
    }
    //init Bu sınıftan nesne oluştuğunda çalışır.Hem de her seferinde
fun bilgiAl(){
    println("----------------------")
    println("Id : ${id}")
    println("Id : ${ad}")
    println("Id : ${fiyat}")

}
//this : Bulunduğu sınıfı temsil eder.Swift dilinde self
//super : Kalıtım ile bir üst sınıfı temsil eder.
}