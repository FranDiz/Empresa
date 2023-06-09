import java.time.LocalDate

/**
 *@constructor Programador hereda de la clase Empleado
 */
open class Programador: Empleado {

    /*constructor por defecto*/

    constructor():super("vacio",
            "jimenez",
            "00000X",
            LocalDate.now().toString(),
            0,
            0.0)

    /*Constructor donde se introducen los parámetros*/

    constructor(nombre:String,apellidos:String,DNI:String,fecha_contrato:String,sueldo_base:Int,base_horas_extras:Double):
            super(nombre, apellidos, DNI, fecha_contrato, sueldo_base, base_horas_extras)

    /**
     * @return pedir_vacaciones devuelve un informe
     */
    open fun pedir_vacaciones(){
        println("Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones")
    }

    /**
     * @return pedir_aumento devuelve un informe
     */
    open fun pedir_aumento(){
        println("El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva")
    }

    /**
     * @Deprecated imprimir_nomina porque ya está en la clase Empleado
     */
    /*
    open fun imprimir_nomina(){
        println("----------------------\n" +
                "NÓMINA \n" +
                "----------------------\n" +
                "DNI : $DNI \n" +
                "Nombre: $apellidos , $nombre \n" +
                "Sueldo: ${calcular_sueldo()}")
    }
    */


}