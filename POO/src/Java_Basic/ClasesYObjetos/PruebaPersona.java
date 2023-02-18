package Java_Basic.ClasesYObjetos;

public class PruebaPersona
{

    public static void main(String[] args)
    {
        Persona objPersona = new Persona();

        objPersona.nombre = "Andres";
        objPersona.apellido = "Garcia";
        objPersona.edad = 31;
        objPersona.genero = "Masculino";
        objPersona.nacionalidad = "Mexicana";

        objPersona.MostrarInformacion();

    }



}
