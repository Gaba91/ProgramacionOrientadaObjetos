package Java_Advanced.Constructores;

public class ClasePrincipal
{
    public static void main(String[] args)
    {

        SinConstructor sin = new SinConstructor();  //Instancia a la clase que no tiene constructor
        sin.PedirNombre();
        sin.Imprimir();

        ConConstructor con = new ConConstructor(); //Instancia a la clase que tiene constructor

        //En resumen: estos metodos nos permiten ahorrar espacio (codigo) y mantenerlo mas agradable a la vista

    }

}
