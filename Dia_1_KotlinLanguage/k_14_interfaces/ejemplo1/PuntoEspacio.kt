package k_14_interfaces.ejemplo1

/**
 *
 * Para poder realizar la implementación de una interface debemos
 * colocar similar a la herencia el operador :
 * Al colocar la llamada a la interface nos dará error en la clase y nos
 * pedirá que implementemos las funciones de la interface.
 *
 * */

class PuntoEspacio(val x: Int, val y: Int, val z: Int) : Punto {

    override fun imprimir() {
        println("Punto en el espacio: ($x, $y, $z)")
    }
}