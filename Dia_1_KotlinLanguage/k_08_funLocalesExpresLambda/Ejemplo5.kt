package k_08_funLocalesExpresLambda

import kotlin.math.pow

/**
 *
 *  Ejemplo de fusión de expresión Lambda con Función de orden superior.
 *
 * */

fun operarLamb(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int{
    return fn(v1, v2)
}

fun main() {
    val suma = operarLamb(2, 3) { x, y -> x + y}
    println(suma)
    val resta = operarLamb(12, 2) { x, y -> x - y }
    println(resta)

    var elevarCuarta = operarLamb(2, 4) { x, y ->
        x.toDouble().pow(y.toDouble()).toInt()
    }
    println(elevarCuarta)
}