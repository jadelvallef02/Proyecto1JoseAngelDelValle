import java.util.Date
class Cuadrante (var drones:Array<Dron?>, var fila:Int, var col:Int ) {
    private var mecanico = "Jack $fila$col"
    private var supervisora = "Vika $fila$col"
    private var ordenes = ArrayList<Orden>()

    fun comprobarDrones(){
        for(i in drones.indices){
            if(drones[i] != null) {
                drones[i]!!.seEstropea()
            }
        }
    }

    fun llegaOrden(o:Orden){
        ordenes.add(o)
    }

    fun devolverOrdenes():ArrayList<Orden>{
        return ordenes
    }
    fun devolverDronesMalEstado():ArrayList<Dron>{
        var dronesMalEstado = ArrayList<Dron>()
        for(i in drones.indices){
            if(drones[i] != null){
                if(!drones[i]!!.operativo){
                    dronesMalEstado.add(drones[i]!!)
                }
            }
        }
        return dronesMalEstado
    }

    fun sustituirDron(i:Int, tet:Tet){
        for(j in drones.indices){
            if(drones[j] != null) {
                if (drones[j]!!.id == i) {
                    drones[j] = tet.solicitarDron()
                }
            }
        }
    }

    fun repararDron(i:Int){
        for(j in drones.indices){
            if(drones[j] != null) {
                if (drones[j]!!.id == i) {
                    drones[j]!!.operativo = true
                }
            }
        }
    }

    fun actualizarOrdenesCumplidas(cumplidas:ArrayList<Orden>){
        ordenes = cumplidas
    }

    fun devolverCantidadOrdenes():Int{
        return ordenes.size
    }

    fun mostrarOrdenes(){
        println("***************Ordenes del cuadrante $fila $col***************")
        for(i in ordenes.indices){
            println(ordenes[i].resumenOrden())
        }
        println()
    }
    override fun toString(): String {
        return "Cuadrante(drones=${drones.contentToString()}, coordenadas='$fila $col', mecanico='$mecanico', supervisora='$supervisora')"
    }


}