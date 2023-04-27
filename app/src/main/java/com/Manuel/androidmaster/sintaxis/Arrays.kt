package com.Manuel.androidmaster

fun main(){
    var arrWeekDays = arrayOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    println(arrWeekDays[1])
    arrWeekDays[1] = "Paco"
    println(arrWeekDays[1])

    for(posicion in arrWeekDays.indices){
        println(arrWeekDays[posicion])
    }
}