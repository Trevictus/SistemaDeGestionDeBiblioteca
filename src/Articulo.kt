sealed class Articulo {
    data class Libro(val titulo: String, val autor: String, val anio: Int)
    data class DVD(val titulo: String, val director: String, val anio: Int)
    data class Revista(val titulo: String, val issue: Int, val anio: Int)


    var estadoPrestamo = false
}