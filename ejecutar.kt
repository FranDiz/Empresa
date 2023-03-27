

import Directivo
import Programador

fun main(){
    var programador1=Programador("Diego","Linares Ortiz","093487387H","31/12/2021",15,30.9)
    var directivo1=Directivo("Jose","Calamares Ortiz","8734873842Y","30/30/2030",10000,0.0,350,70.8,"El dire")
    var empleadoEjemplo=Empleado("Antonio","García Ortiz","093487387H","31/12/2021",15,30.9)
    var p2=Persona("Ana","García Ortiz","093487387H")

    directivo1.calcular_sueldo()
    programador1.pedir_vacaciones()
    programador1.pedir_aumento()
    programador1.imprimir_nomina()
}