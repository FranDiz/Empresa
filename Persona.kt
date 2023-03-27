/**
 * @param Persona clase abierta con los valores nombre, apellidos y DNI
 * @
 */
open class Persona(nombre:String,apellidos:String,DNI:String) {
    var nombre= nombre
        get(){
            return field
        }
        set(value){
            field=value
        }
    var apellidos = apellidos
        get(){
            return field
        }
        set(value){
            field=value
        }
    var DNI = DNI
        get(){
            return field
        }
        set(value){
            field=value
        }


    /**
     * @return mostrarinfo imprime la informació del objeto Persona
     */
    fun mostrarinfo(){
        println("DNI : $DNI \n Nombre: $apellidos,$nombre")
    }


}