package k_10_poo.ejemplo12

/**
 *
 * Creación de gets y sets
 * Por defecto en Kotlin no existen los getters y setters, pero podemos crearlos
 * sin necesidad de llamarlos y es que realizarán un proceso interno de funcionalidad
 * y no habrá necesidad de llamarlos y solo acceder al atributo.
 * Se utiliza la intrucción SET(VALOR) { } y GET() { }
 * cabe recalcar que ambas instrucciones debemos colocarlas debajo de cada variable
 * que necesitemos implementar funcionalidad.
 *
 * */

class Persona {
    var nombre = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return "{ $field }"
        }

    var edad = 0
        set(valor) {
            field = if(valor <= 0)
                1
            else
                valor
        }

}