package com.Manuel.androidmaster

fun main(){
    inmutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    weekDays.add("dia de manuel")
    //indice de donde lo meto
    weekDays.add(2,"nuevo dia")

    if(weekDays.isEmpty()) println("esta vacia")
    if(weekDays.isNotEmpty()) println("no esta vacia")
    println(weekDays.last())
}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    var example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{println(it)}
    readOnly.forEach{weekDay -> println(weekDay)}

}