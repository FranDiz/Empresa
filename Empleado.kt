import java.time.LocalDate

/**
 * @param Empleado clase abierte que hereda de @param Persona y tiene 4 atributos
 */

/**
 * @constructor Constructor principal, Empleado hereda de Persona
 */
open class Empleado: Persona {

    var fecha_contrato=""
        get(){
            return field
        }
        set(value){
            field=value
        }
    var sueldo_base=0
        get(){
            return field
        }
        set(value){
            field=value
        }
    var base_horas_extra=0.0
        get(){
            return field
        }
        set(value){
            field=value
        }
    var num_horas_extra=0.0
        get(){
            return field
        }
        set(value){
            field=value
        }

    /**
     *@constructor constructor secundario para cuando no se introduce @param num_horas_extra
     */

    constructor(nombre:String,apellidos:String,DNI:String,fecha_contrato:String,sueldo_base:Int,base_horas_extra:Double):
            super(nombre,apellidos, DNI){
        this.fecha_contrato= fecha_contrato
        this.sueldo_base=sueldo_base
        this.base_horas_extra=base_horas_extra

            }
    constructor():super("vacio","jimenez","00000000X"){
        fecha_contrato= LocalDate.now().toString()

    }

    /**
     * @return imprimir_notas imprime la información del objeto empleado
     * @param calcular_sueldo función interna del objeto
     */
    open fun imprimir_nomina() {
        println(
            "----------------------\n" +
                    "NÓMINA \n" +
                    "----------------------\n" +
                    "DNI : $DNI \n" +
                    "Nombre: $apellidos , $nombre \n" +
                    "Sueldo: ${calcular_sueldo()}"
        )
    }

    /**
     * @return calcular_sueldo devulve el sueldo del trabajador
     */
    open fun calcular_sueldo():Double{
        return  sueldo_base+(base_horas_extra*num_horas_extra)
    }

}