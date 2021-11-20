package tech.mdevconf.expositores.model

// datos a interfaz de usuario
// lista de frutas (Codigo, nombre, descripcion, precio, stock, fechaVencimiento, foto) --> adapter --> View (RecyclerView, ListView)

data class Speaker(
    val image: Int,
    val name: String,
    val talk: String
    )