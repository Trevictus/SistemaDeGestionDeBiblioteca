sealed class Usuario {
    class Estudiante(val id: String, val nombre: String, val carrera: String): Usuario()
    class Profesor(val id: String, val nombre: String, val departamento: String): Usuario()
    class Visitante(val id: String, val nombre: String): Usuario()

    fun prestamoLibro(usuario: Usuario, articulo: Articulo) {
        if(usuario !is Visitante){
            if(usuario is Profesor){
                println("Puedes tenerlo prestado 2 semanas.")
            }
            if(usuario is Estudiante){
                println("Puedes tenerlo prestado 1 semana.")
            }
            println("El objeto se puede prestar.")
            articulo.estadoPrestamo = true
        }
    }
}