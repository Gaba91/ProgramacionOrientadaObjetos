package Java_Basic.Ciclos;

public class For
{
    public static void main(String[] args)
    {

        for (int i = 1; i < 2; i++) // Este incremento permite sumar 1 a 1
        {
            System.out.println("For 1: " + i);
        }
        for (int i = 0; i < 10; i+=3)   // Este incremento permite decidir la cantidad a sumar que deseemos, modificando
                                        // el numero posterior al "+="
        {

            System.out.println("For 2: " + i);
        }

        for (int i = 0; i <= 10; i++)
        {

            if(i==5)
            {
                break; //Con break podemos romper el ciclo para que ahi detenga en cuanto cumpla con el valor asignado,
                        // para que continue, podemos usar "continue", lo que hara es evitar el valor asignado (filtrar)
            }
            System.out.println("For 3: " + " " + i);
        }

    }
}
