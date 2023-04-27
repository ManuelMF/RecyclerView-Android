package com.Manuel.androidmaster

fun main(){

}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("No es un mes válido")
    }
}

fun getTrimester(month: Int):String{
    val ret = when(month){
        1, 2, 3 -> return "primer trimestre"
        4, 5, 6-> return "segundo trimestre"
        7, 8, 9 -> return "tercer trimestre"
        10, 11, 12 -> return "cuarto trimestre"
        else -> return "No es un mes válido"
    }

    return ret;
}

fun getSemester(month: Int){
    when(month){
        in 1..6 -> println("primer trimestre")
        in 6 .. 12-> println("cuarto trimestre")
        //otra forma valida
        !in 1 .. 12 -> println("No es un mes válido")
        else -> println("No es un mes válido")


    }
}

// acepta cuaquier tipo de dato
fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("es true")
    }
}