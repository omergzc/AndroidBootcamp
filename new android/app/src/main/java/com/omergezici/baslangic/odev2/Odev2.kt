package com.omergezici.baslangic.odev2

class Odev2 {

    fun question1(Celcius:Double):Double{
        val f:Double=(Celcius*1.8)+32
        return f
    }


    fun question2(kisaKenar:Double,uzunKenar:Double){
        val cevre =(kisaKenar*2)+(uzunKenar*2)
        println(cevre)


    }
    fun question3(sayi:Int):Int{
        var a=sayi
        var faktorial=1
        while (a>0){
            faktorial*=a
            a--
        }
        return faktorial
    }




    fun question4(kelime:String){

        var  kelimeUzunluk= kelime.length
        var sayi=0
        if (kelimeUzunluk!=0){
            while (kelimeUzunluk>0){
                if (kelime[kelimeUzunluk-1]=='a'||kelime[kelimeUzunluk-1]=='A'){
                    sayi+=1
                }
                kelimeUzunluk--
            } }
        println(sayi)
    }



    fun question5(kenarSayi:Int):Int{
        if (kenarSayi>=3){
            val icAciToplam=(kenarSayi-2)*180
            return icAciToplam
        }
        else{
            return 0
        }
    }


    fun question6(gun:Int):Int{
        var maas=0
        val maxSaat =8
        val calismaSaatUcreti=10
        val mesaiSaatUcreti=20
        if (gun*maxSaat<=160){
            maas=gun*maxSaat*calismaSaatUcreti
        }
        else if(gun*maxSaat>160){
            maas=(20*maxSaat*calismaSaatUcreti)+((gun-20)*maxSaat*mesaiSaatUcreti)
        }
        return maas
    }


    fun question7(kota:Int):Int{
        var para=0
        val gb50=100
        val gb1=4
        if (kota<=50){
            para=gb50
        }
        else {
            para=gb50+((kota-50)*gb1)
        }
        return para
    }



}