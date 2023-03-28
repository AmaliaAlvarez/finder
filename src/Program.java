import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        //Pedir por teclado el nombre de un archivo de texto
        //Pedir por teclado un texto para buscar
        //Recorrer el archivo y mostrar todas aquellas lineas
        //que contengan el texto buscado


        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el nomre del archivo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el texto a buscar: ");
        String buscado = sc.nextLine();

        Path archivo = Paths.get(nombre);

        if (Files.exists(archivo)) {
            int numeroLinea = 0;
            for(String linea: Files.readAllLines(archivo)) {
                numeroLinea++;
                if (linea.contains(buscado)) {
                    System.out.println("Linea: " + numeroLinea + ": " + linea);
                }
            }

        }else {
            System.out.println("El archivo NO existe.");
        }
    }
}
