package com.Manuel.androidmaster

fun main(){
                   //? para decir que puede ser null
    var name:String? = null
//salta porque puede ser que sea null
   //println(name!![3])
    //!! le decimos que estamos seguro que no puede ser null

    println(name?.get(3))
    // si no es nulo haces esto

    println(name?.get(3) ?: "Es nulo Wey")

}