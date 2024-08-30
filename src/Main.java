import javax.swing.*;
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
        //COMENTAR EL CODIGO DE ARRIBA PARA NO INTERFERIR CONSOLA - JOPTIONPANE

        //Pedimos el ingreso de la cantidad de estudiantes
        String inputEstudiantes = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes del curso:");

        // Convertir la entrada a un número entero
        try {
            int numeroEstudiantes = Integer.parseInt(inputEstudiantes);

            //creamos el array
            String[] arrayEstudiantes = new String[numeroEstudiantes];
            for (int i= 0; i < numeroEstudiantes; i++)
            {
                arrayEstudiantes[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante n°: " + (i+1));
            }
            //mostramos la lista de estudiantes
            String lista = "Lista de estudiantes \n";
            for (int i = 0; i < numeroEstudiantes; i++)
            {
                lista = lista + (i+1) + ": " + arrayEstudiantes[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, lista);

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }

        //EJERCICIO 5. Se propone resolver con "arrays paralelos", pero debería implementarse la clase Estudiante
        //Pedimos el ingreso de la cantidad de estudiantes
        String stringCamtEstudiantes = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes del curso:");

        // Convertir la entrada a un número entero
        try {
            int numeroEstudiantes = Integer.parseInt(stringCamtEstudiantes);

            //creamos los arrays paralelos
            String[] arrayEstudiantes = new String[numeroEstudiantes];
            int[] arrayNotas = new int[numeroEstudiantes];

            for (int i= 0; i < numeroEstudiantes; i++)
            {
                arrayEstudiantes[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante n°: " + (i+1));
                String notaInput = JOptionPane.showInputDialog("Ingrese la nota de " + arrayEstudiantes[i] + ":");
                try
                {
                    arrayNotas[i] = Integer.parseInt(notaInput);
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Nota inválida, se asignará 0 por defecto.");
                    arrayNotas[i] = 0;
                }
            }

            // Encontramos la nota mínima y máxima
            //asignamos por defecto nota min y max al index 0, mismo para nombre estudiante
            int notaMin = arrayNotas[0];
            int notaMax = arrayNotas[0];

            String estudianteMin = arrayEstudiantes[0];
            String estudianteMax = arrayEstudiantes[0];

            //iteramos para comparar y reemplazar máximos y mínimos
            for (int i = 1; i < numeroEstudiantes; i++)
            {
                if (arrayNotas[i] < notaMin)
                {
                    notaMin = arrayNotas[i];
                    estudianteMin = arrayEstudiantes[i];
                }
                if (arrayNotas[i] > notaMax)
                {
                    notaMax = arrayNotas[i];
                    estudianteMax = arrayEstudiantes[i];
                }
            }

            //mostramos la lista de estudiantes
            String lista = "Lista de estudiantes con notas\n";
            for (int i = 0; i < numeroEstudiantes; i++)
            {
                lista = lista + (i + 1) + ": " + arrayEstudiantes[i] + " - Nota: " + arrayNotas[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, lista);

            // Mostramos el estudiante con la nota mínima y máxima
            JOptionPane.showMessageDialog(null, "El estudiante con la nota mínima es: "
                    + estudianteMin + " con una nota de " + notaMin);
            JOptionPane.showMessageDialog(null, "El estudiante con la nota máxima es: "
                    + estudianteMax + " con una nota de " + notaMax);

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }


    }
}