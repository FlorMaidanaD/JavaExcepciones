/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package javaapplication64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaApplication64 {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1 = (int) (Math.random() * 500);
        int num2 = 0;
        int cont = 1;
        String aux;
        System.out.println("El numero es: " + num1);
        System.out.println("***********************");
        /*       
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        aux = br.readLine();
        num2=br.read();
        */               
        
        do {
            try {
                System.out.println(" - Intento " + cont);
                System.out.print("Ingrese un num = ");
                
                aux = leer.next();
                num2=Integer.parseInt(aux);

                if (num1 == num2) {
                    System.out.println("Adivinaste!!!!");
                } else {
                    System.out.println("Fallaste....");
                    if (num1 > num2) {
                        System.out.println("El numero a adivinar es MAYOR");
                    } else {
                        System.out.println("El numero a adivinar es MENOR");
                    }
                }
                System.out.println("***********************");
                cont++;
            } catch (Exception e) {
                System.out.println("!!!!!!!! OJO !!!!!!!!");
                System.out.println("....Debe ingresar un numero....");               
                cont++;
            }
        } while (num1 != num2 && cont < 10);

    }

}
