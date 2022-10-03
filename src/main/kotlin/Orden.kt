import java.util.Date
import kotlin.random.Random

abstract class Orden(var fecha: Date, var completado:Boolean, var fila: Int ,var col: Int) {

    open fun seRepara():Boolean{ //función para OrdenReparación que no tiene que heredar OrdenReconocimiento
        return false
    }
    open fun solicitarIdDronACambiar():Int{ //función de OrdenReparación que no tiene que heredar OrdenReconocimiento
        return -1
    }

    open fun devolverIdDron():Int{ //función de OrdenReparación que no tiene que heredar OrdenReconocimiento
        return -1
    }

   abstract fun resumenOrden():String
    override fun toString(): String {
        return "Orden(fecha=$fecha, completado=$completado, cuadrante=$fila $col)"
    }
}