package Java_Basic.ModificadoresDeAcceso;

public class ModificadorPublico
{
    void ejemploCuatro()
    {
        System.out.println("Aprendiendo a gatear en programacion");
    }
    public static void main(String[] args)
    {
        ModificadorPublico objModificadorPublico = new ModificadorPublico();
        objModificadorPublico.ejemploCuatro();



    }


}
