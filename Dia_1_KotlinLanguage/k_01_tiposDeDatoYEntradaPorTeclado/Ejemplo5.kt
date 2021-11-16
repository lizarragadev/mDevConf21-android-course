package k_01_tiposDeDatoYEntradaPorTeclado

/**
 *
 * Ejemplo básico para calcular precio de productos.
 *
 * */

fun main() {
    print("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de productos:")
    val cantidad = readLine()!!.toInt()
    val total = precio.times(cantidad)
    println("El total a pagar es $total")
}