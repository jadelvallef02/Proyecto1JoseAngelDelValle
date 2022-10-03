import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class Tet {
   private var tet = Array<Dron?>(100){null}
    private var ordenesCursadas = ArrayList<Orden>()

    fun iniciarTet(){
        for (i in tet.indices){
            tet[i] = FactoriasDron.factoriaDronGenerico(i)
        }
    }

    fun actualizarOrdenes(ordenes:ArrayList<Orden>){
        for(i in ordenes.indices){
            ordenesCursadas.add(ordenes[i])
        }
    }
    fun mandarDrones():Array<Dron?>{
        var alea = Random.nextInt(0,3);
        var drones = Array<Dron?>(alea+1){null}
        for(i in 0..alea){
            for (x in tet.indices){
                if(tet[x] != null){
                    drones[i] = tet[x]
                    tet[x]=null
                    break
                }
            }
        }
        return drones
    }

    fun solicitarDron():Dron?{
        for(i in tet.indices){
            if(tet[i] != null){
                var d = tet[i]
                tet[i] = null
                return d
                break
            }
        }
     return null
    }


}