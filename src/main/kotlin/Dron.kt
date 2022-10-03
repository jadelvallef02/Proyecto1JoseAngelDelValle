import kotlin.random.Random

class Dron (var id:Int, var operativo:Boolean){

    fun seEstropea(){
        var alea = Random.nextInt(1,10);
        if(alea < 3) operativo = false;
    }

    override fun toString(): String {
        return "Dron(id=$id, operativo=$operativo)"
    }

}