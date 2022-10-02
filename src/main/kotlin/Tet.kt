import kotlin.random.Random

class Tet {
   private var tet = Array<Dron?>(100){null}

    fun iniciarTet(){
        for (i in tet.indices){
            tet[i] = Factorias.factoriaDronGenerico(i);
        }
    }

    fun mandarDrones():Array<Dron?>{
        var alea = Random.nextInt(1,3);
        var drones = Array<Dron?>(alea){null}
        for(i in 1..alea){
            for (x in tet.indices){
                if(tet[x] != null){
                   drones[i] = tet[x]
                    tet[x]=null;
                }
            }
        }
        return drones
    }


}