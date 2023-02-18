package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClaseHijaSuma extends ClasePadre
{
    @Override //---> A esto se le conoce como anular/sobreescribir metodos, es decir cuando estamos usando el polimorfismo.
    public void Operaciones()
    {
        resultado = valorUno + valorDos;

    }

}
