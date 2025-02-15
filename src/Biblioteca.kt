class Biblioteca {
    fun mostrarDatosAlquiler(): String {
        return ""
    }

    fun registrarUsuario() {
        println("Introduce tu nombre: ")
        val nombre = readln()
        println("¿Eres: profesor, estudiante o visitante?\n")
        val rol = readln().lowercase().trim()
        if (rol == "profesor") {
            println("Introduce departamento: ")
            val departamento = readln()
            val profesor = Usuario.Profesor(generarId(),nombre, departamento)
        } else if (rol == "estudiante") {
            println("Introduce carrera: ")
            val carrera = readln()
            val estudiante = Usuario.Estudiante(generarId(),nombre, carrera)
        } else if (rol == "visitante") {
            println("Bienvenido.")
            val visitante = Usuario.Visitante(generarId(), nombre)
        } else {
            println("Operación anulada.")
        }

    }

    fun registrarArticulo() {
        println("Introduce el articulo a alquilar, libro, revista, DVD: ")
        val articulo = readln().lowercase().trim()
        println("Introduce el titulo: ")
        val titulo = readln()
        println("Introduce el año de publicación: ")
        val anio = readln().toInt()
        if (articulo == "libro") {
            println("Introduce el autor del libro: ")
            val autor = readln()
            val libro = Articulo.Libro(titulo, autor, anio)
        } else if (articulo == "revista") {
            println("Introduce Issue: ")
            val issue = readln().toInt()
            val revista = Articulo.Revista(titulo, issue, anio)
        } else if (articulo == "dvd") {
            println("Introduce el director: ")
            val director = readln()
            val dvd = Articulo.DVD(titulo, director, anio)
        } else {
            println("Operación anulada.")
        }


    }


    companion object Id {
        private var id = 0
        fun generarId(): String {
            return id++.toString()
        }
    }
}