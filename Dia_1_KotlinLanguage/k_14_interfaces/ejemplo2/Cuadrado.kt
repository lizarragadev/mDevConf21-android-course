package k_14_interfaces.ejemplo2

/**
 *
 * Realizamos la implementacion de las funciones
 * en la interface Figura
 *
 * */

class Cuadrado(val lado: Int): Figura {
    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    override fun calcularPerimetro(): Int{
        return lado * 4
    }
}
