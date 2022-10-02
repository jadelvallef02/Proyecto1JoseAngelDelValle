import kotlin.random.Random

class Tet {
   private var tet = Array<Dron?>(100){null}

    fun iniciarTet(){
        for (i in tet.indices){
            tet[i] = FactoriasDron.factoriaDronGenerico(i);
        }
    }

    fun mandarDrones():Array<Dron?>{
        var alea = Random.nextInt(0,2);
        var drones = Array<Dron?>(alea+1){null}
        for(i in 0..alea){
            for (x in tet.indices){
                if(tet[x] != null){
                    drones[i] = tet[x]
                    tet[x]=null;
                    break
                }
            }
        }
        return drones
    }


}