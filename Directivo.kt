import java.time.LocalDate

open class Directivo: Empleado {

    var plus_direccion=0
    var dietas=0.0
    var cargo=""
    //var sueldo_total=sueldo_base+(base_horas_extra*num_horas_extra)+plus_direccion+dietas

    constructor(nombre:String,apellidos:String,DNI:String,fecha_contrato:String,sueldo_base:Int,base_horas_extras:Double,plus_direccion: Int,dietas: Double,cargo: String):
            super(nombre, apellidos, DNI, fecha_contrato, sueldo_base, base_horas_extras)

    constructor():super("vacio", "jimenez", "00000000X", LocalDate.now().toString(),0, 0.0)

    override fun calcular_sueldo():Double{
        //return  sueldo_base+(base_horas_extra*num_horas_extra)+plus_direccion+dietas
        return super.calcular_sueldo()+plus_direccion+dietas

    }

    override fun imprimir_nomina(){
        /*
        println("----------------------\n" +
                "NÓMINA \n" +
                "----------------------\n" +
                "DNI : $DNI \n" +
                "Nombre: $apellidos , $nombre \n" +
                "Sueldo: ${calcular_sueldo()}")

         */
        super.imprimir_nomina()
        println("\n Cargo: $cargo")
    }
       // println("DNI: $DNI \n Nombre: $apellidos , $nombre \n Sueldo: ${calcular_sueldo()} \n Cargo: $cargo")
      //  println("DNI: $DNI \n Nombre: $apellidos , $nombre \n Sueldo: ${this.calcular_sueldo()} \n Cargo: $cargo")






}