import java.util.Date
import kotlin.random.Random


fun generarOrdenesReconocimiento(fila:Int, col:Int):ArrayList<OrdenReconocimiento>{
    var alea = Random.nextInt(5,10);
    var ordenes = ArrayList<OrdenReconocimiento>()
    var fecha = Date()
    for(i in 1..alea){
        var alea2 = Random.nextInt(1,3);
        var area = Random.nextInt(1,20);
        when(alea2){
            1-> ordenes.add(OrdenReconocimiento(fecha, false, fila, col, area, "animal"))
            2-> ordenes.add(OrdenReconocimiento(fecha, false, fila, col, area, "vegetal"))
            3-> ordenes.add(OrdenReconocimiento(fecha, false, fila, col, area, "radiación"))
        }
    }
    return ordenes
}

/*fun resolverOrdenes(tierra: Array<Array<Cuadrante?>>){
    for(i in tierra.indices){
        for(j in tierra[i].indices){
            var ordenesSector = tierra[i][j]!!.devolverOrdenes()
            for(x in ordenesSector.indices){
                if(ordenesSector[x] is OrdenReparacion){
                    ordenesSector[x].
                }
            }
        }
    }
}*/