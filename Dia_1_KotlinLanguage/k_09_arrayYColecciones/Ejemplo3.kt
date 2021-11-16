package k_09_arrayYColecciones

/**
 *
 *  Para poder recorrer un IntArray en un for utilizamos la instrucción coleccion.indices
 *
 * */

fun main() {
    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento ${i+1}: ")
        arreglo[i] = readLine()!!.toInt()
    }
    var ordenado = true
    for(i in 0..arreglo.size-2)
        if (arreglo[i+1] < arreglo[i])
            ordenado = false
    if (ordenado)
        print("Los elementos están ordenados de menor a mayor")
    else
        print("Los elementos no están ordenados de menor a mayor")
}