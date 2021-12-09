/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

/**
 *
 * @author karis
 */
import java.util.Scanner;

public class Prueba1 {

    
    public static void main(String[] args) 
    {
       Persona usuario=new Persona();
        
     System.out.println("Bienvenido al Sistema");
     
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Ingrese Nombre");
     usuario.nombre=sc.next();
     System.out.println("Ingrese Apellido");
     usuario.apellido=sc.next();
     System.out.println("Ingrese Edad");
     usuario.edad=sc.next();
     System.out.println("Ingrese Hobbie");
     usuario.hobbie=sc.next();
     System.out.println("Ingrese Editor Preferido");
     usuario.editorpreferido=sc.next();
     System.out.println("Ingrese Sistema Operativo Utilizado");
     usuario.soutilizado=sc.next();
     System.out.println("Los datos ingresados son:");
     System.out.println(usuario.mostrar());
       }
    }
    

