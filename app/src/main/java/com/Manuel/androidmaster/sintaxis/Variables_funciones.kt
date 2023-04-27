package com.Manuel.androidmaster

/*
* Variables
* */

fun main(){

    showAge(22);
    println(res2Num(40,22))
}
                    //por defecto pondrá 30
fun showAge(age:Int = 30){
    println("tienes $age años")
}
//                          le decimos que le devolvemos un int
fun res2Num(n1:Int, n2:Int):Int{
    return n1 - n2;
}

fun variables(){
    //String
    var name:String = "Manuel"

    //Char
    val cha:Char = 's'

    //int
    val age:Int = 30

    //Long
    val lon:Long = 2000000000000000

    //Float
    val flo:Float = 2.54f

    //Double
    val dou:Double = 3333333.33

    //Boolean
    val bool:Boolean = true

    print(name)

    //val no puedo cambiarlas
    //usar var

    name = "$name Muñoz Felix"


}