import java.util.Date
import kotlin.random.Random

fun iniciarTierra(tet:Tet):Array<Array<Cuadrante?>>{
    var tierra = Array<Array<Cuadrante?>>(3){ Array<Cuadrante?> (3){null} }
    for(i in tierra.indices){
        for(j in tierra[i].indices) {
            tierra[i][j] = Cuadrante(tet.mandarDrones(), i, j)
        }
    }
    return tierra
}

fun mostrarTierra(tierra: Array<Array<Cuadrante?>>){
    for(i in tierra.indices){
        for(j in tierra[i].indices){
            print("${tierra[i][j]}       |       ")
        }
        println()
    }
    println()
}

fun recorrerTierraVerDrones(tierra: Array<Array<Cuadrante?>>): Array<Array<Cuadrante?>>{
    for(i in tierra.indices){
        for(j in tierra[i].indices){
            tierra[i][j]!!.comprobarDrones()
        }
    }
    return tierra
}

fun tetRecorreTierra(tierra: Array<Array<Cuadrante?>>):ArrayList<Orden>{
    var ordenes = ArrayList<Orden>()
    for(i in tierra.indices){
        for(j in tierra[i].indices){
            var dronesRotos = tierra[i][j]!!.devolverDronesMalEstado()
            var ordenesReco = generarOrdenesReconocimiento(i,j)
            for(x in dronesRotos.indices){
                var fecha = Date()
                tierra[i][j]!!.llegaOrden(OrdenReparacion(fecha, false, i, j, dronesRotos[x], false))
            }
            for(m in ordenesReco.indices) {
                tierra[i][j]!!.llegaOrden(ordenesReco[m])
            }
            var ordenesDelCuadrante = tierra[i][j]!!.devolverOrdenes()
            for(l in ordenesDelCuadrante.indices){
                ordenes.add(ordenesDelCuadrante[l])
            }
        }
    }
    return ordenes
}

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

fun resolverOrdenes(tierra: Array<Array<Cuadrante?>>){
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
}