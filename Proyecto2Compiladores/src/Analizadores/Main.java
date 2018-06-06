/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.in;
import java.util.Scanner; 
/**
 *
 * @author María Inés
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //java.util.Scanner in = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Segundo Proyecto Compiladores");
        System.out.println("Ingresa el valor de x: ");
        Scanner cadena = new Scanner (System.in);
        int x = cadena.nextInt();
        System.out.println ("El valor de X es: " + x);
        String archivo = "prueba.txt";
        try{
        Analizador_Lexico lexico = new Analizador_Lexico (new BufferedReader (new FileReader(archivo)));
        analisis_sintactico sintactico = new analisis_sintactico (lexico);              
        sintactico.parse();
        System.out.println("Resultados: "+sintactico.resultado);
        } 
        catch(Exception e){
         
             System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
