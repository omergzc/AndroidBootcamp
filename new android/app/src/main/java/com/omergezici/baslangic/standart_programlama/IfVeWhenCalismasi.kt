package com.omergezici.baslangic.standart_programlama

fun main() {
    val yas=17

    if(yas>=18){
        println("Resitsiniz")
    }
    else{
        println("I am a child")
    }

    val ka="admin"
    val s=123456
    val sayi=10
    if (ka=="admin"&&s==123456){
        println("Hoşgeldiniz")

    }
    else{
        println("Hatalı Giriş")
    }



    if(sayi==9||sayi==10){
        println("sayı 9 veya 10 dur")
    }
    else{
        println("sayı 9 veya 10 değildir")
    }
    //When
    val number=1
    when(number){
        1-> println("sayı 1 dir")
        1-> println("sayı 2 dir")
        else-> println("Tanımlanmayan sayı")


    }
}