package Java_Basic.SentenciasDeControl;

import java.util.Scanner;

public class TareaPromedios
{
    public static void main(String[] args)
    {

        float Matematicas = 5, Biologia = 8, Quimica = 7;

        float sumatotal = Matematicas + Biologia + Quimica;
        float promedio = sumatotal / 3;

        System.out.println("Promedio: " + promedio);


        if (promedio < 7)
        {
            System.out.println("No aprobado");
        }
        else
        {
            System.out.println("Aprobado");
        }


    }
}
