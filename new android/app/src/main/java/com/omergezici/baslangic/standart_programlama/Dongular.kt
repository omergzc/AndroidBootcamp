package com.omergezici.baslangic.standart_programlama

fun main() {
    for (i in 1..3){
        println("Döngü 1: $i")
    }
    for (x in 10..20 step 5){
        println("Döngü 2: $x")
    }
    for (a in 20 downTo 10 step 5){
        println("Döngü 3: $a")
    }
    for (i in 1..5){
        if (i==3){
            break
        }
    }
    for (i in 1..5){
        if (i==3){
          continue
        }
        println("Döngü 6 : $i")
    }

}