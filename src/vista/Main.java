package vista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    // TIPO DE DATO
    //1.- ENTEROS
    
    
    // los declaro desde 0
    int numUno=0;//=> se entiende que es publica 
    int numDos=0;
    
    
    // sobrescribir valores
    numUno = 0;
    numDos= 0;
    // suma 2 numeros 
    
    int resultado = (numUno + numDos);
    // imprimir es un comando de salida 
        System.out.println("El resultado es; "+ resultado);
        
        
        //3.- Suma 2 numeros pidiendo datos 
        System.out.println("Ingrese el numero 1");
        Scanner es = new Scanner(System.in);
        
        //PASAR UN OBJETO A UNA CADENA DE TEXTO
        
        
        int num1=Integer.parseInt(es.next());//
        System.out.println("Ingrese el numero 2");
        int num2 = es.nextInt();
        // sobrescritura
        num1+=num2;//num1+=num2 es lo mismo que result=num1+num2
        System.err.println("El resultado es;"+num1);
        
        //TRANSFORMACION DE CADENA A ENTERO
        //1 CADENA = {}DE CARACTERES
        String cadena = "suma de 2 numeros es:";
        System.out.print("ingrese el numero 1: ");
        int n1=Integer.parseInt(es.next());
        System.out.print("ingrese el numero 2: ");
        int n2=es.nextInt();
        //TRANSFORMARNDO O CASTEANDO ENTRE DATOS PRIMITIVOS 
        int res = (int)n1+n2;
        //DOUBLE ACEPTA ENTEROS Y DECIMALES
        int resul=n1+n2;
        
        
    }  
}
