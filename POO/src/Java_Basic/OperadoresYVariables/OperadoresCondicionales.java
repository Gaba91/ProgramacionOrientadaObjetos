package Java_Basic.OperadoresYVariables;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 5;
        var resultado = a >= 0 && a <= 10 && a == 5; // && significa "y" o "and"

        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }


        var vacaciones = false;
        var diaDescanso = true;
        var domingo = false;

        if (vacaciones || diaDescanso || domingo) // || signica "o" o "or"
        {
            System.out.println("Puedo beber cerveza");
        } else {
            System.out.println("No puedo beber cerveza");
        }
    }
}
