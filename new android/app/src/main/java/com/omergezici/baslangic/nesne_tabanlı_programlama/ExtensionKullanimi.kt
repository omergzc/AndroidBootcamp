package com.omergezici.baslangic.nesne_tabanlı_programlama

fun main() {
val sonuc=5 carp 2 carp 4 carp 3//5.carp(2)
    println(sonuc)
}
infix fun Int.carp(sayi1:Int):Int{
    return this*sayi1
}
fun Int.sum(sayi1:Int):Int{
    return this+sayi1
}