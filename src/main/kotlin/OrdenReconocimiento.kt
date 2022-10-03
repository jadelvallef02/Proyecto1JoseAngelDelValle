import java.util.Date

class OrdenReconocimiento(
    fecha: Date,
    completado: Boolean,
    fila: Int,
    col: Int,
    var area: Int,
    var encontrado: String
) : Orden(fecha, completado, fila, col) {

    override fun seRepara():Boolean{
        return true
    }

    override fun resumenOrden() :String{
        var salida ="Orden de Reconocimiento $fecha, "
        if(completado){
            salida+=" encontrado: $encontrado, estado de la orden: Terminado"
        }else{
            salida+=" buscado: $encontrado, estado de la orden: Sin terminar"
        }
        return salida;
    }
    override fun toString(): String {
        return "OrdenReconocimiento(${super.toString()},area=$area, encontrado='$encontrado')"
    }
}