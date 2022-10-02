import java.util.Date

open class Orden(var fecha: Date, var completado:Boolean, var cuadrante:IntArray) {

    override fun toString(): String {
        return "Orden(fecha=$fecha, completado=$completado, cuadrante=${cuadrante.contentToString()})"
    }
}