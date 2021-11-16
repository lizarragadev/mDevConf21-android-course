package k_01_tiposDeDatoYEntradaPorTeclado

/**
 *
 * Ejemplo para hallar el perímetro de un cuadrado.
 *
 * */

fun main() {
    print("Ingrese longitud de un lado: ")
    println("El perimetro es: ${readLine()!!.toInt().times(4)}")
}