import kotlin.random.Random

class Dron (var id:Int, var operativo:Boolean){

    fun seEstrope(){ operativo = false; }

    fun seRepara():Boolean{
        var fallido = false;
        var alea = Random.nextInt(1,2);
        if(alea == 1)
            operativo = true;
        else
            fallido = true;
        return fallido;
    }

    override fun toString(): String {
        return "Dron(id=$id, operativo=$operativo)"
    }

}