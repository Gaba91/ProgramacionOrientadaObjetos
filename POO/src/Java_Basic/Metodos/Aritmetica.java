package Java_Basic.Metodos;

public class Aritmetica
{
    //Atributos

    int a;
    int b;
    int resultado;

    //Metodo sumar
    public void sumar ()
    {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);

    }

    public int SumarConRetorno()
    {
        int resultado = a + b;
        return resultado;

        //return a + b; //<--- Esto es otra forma de obtener mismo resultado pero se queda comentado
    }

        public int SumarConParametros(int param1, int param2) //<--- Parametros y argumentos es lo mismo
        {
            a = param1;
            b = param2;

            return a + b;
        }

}
