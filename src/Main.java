import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //EJERCICIOS ARRAYS
        //crear una array con los ints 10, 20, 30, 40 y 50
        int [] numeros = new int[5];
        for (int i = 0; i<5; i++)
        {
            numeros[i]= (i+1)*10;
            System.out.println("El número en la posición " + i + " es el " + numeros[i]);
        }

        //creación dinámica: que el usuario defina la longitud del array y vaya ingresando los números
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("¿Que longitud tendrá el array?");
            String longiString = scanner.nextLine();
            try
            {
                int longInt = Integer.parseInt(longiString);
                int[] numArray = new int[longInt];
                for(int i = 0; i < longInt; i++)
                {
                    System.out.println("Ingrese el entero para la posición " + i);
                    numArray[i] = Integer.parseInt(scanner.nextLine());
                }
                for(int i = 0; i < longInt; i++)
                {
                    System.out.println("El número en la posición " + i + " es " + numArray[i]);
                }
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Por favor ingrese un número válido");
                System.out.println(e.getMessage());
            }
        }

        //EJERCICIO 1: días de la semana
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        while (true)
        {
            try
            {
                System.out.println("¿Qué número de día es hoy");
                int numDia = Integer.parseInt(scanner.nextLine());
                if (numDia > 0 && numDia <= dias.length)
                {
                    System.out.println("Que tengas un buen " + dias[numDia-1]);
                    break;
                }
                else
                {
                    System.out.println("No existe el día " + numDia);
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Por favor ingrese un número válido");
                System.out.println(e.getMessage());
            }
        }

        //EJERCICIO 3: estudiantes

    }
}