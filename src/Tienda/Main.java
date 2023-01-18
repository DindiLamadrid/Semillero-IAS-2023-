package Tienda;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[4];
        Scanner opcion_usuario = new Scanner(System.in);
        int respuesta_user;


        System.out.println("1. Añadir nuevo cliente");
        System.out.println("2. Borrar cliente");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Mostrar los clientes");
        System.out.println("5. Salir");
        System.out.println("Escribe una de las opciones ");
        respuesta_user = opcion_usuario.nextInt();
        System.out.println("Haz seleccionado la opción número " + respuesta_user);

        switch (respuesta_user){
            case 1:
                System.out.println("Ingrese nombre: ");
                Cliente clienteNuevo = new Cliente();
                clienteNuevo.setNombre(opcion_usuario.nextLine());
                opcion_usuario.nextLine();

                System.out.println("Ingrese cédula: ");
                clienteNuevo.setCedula(opcion_usuario.nextInt());

                for (int i = 0; i < clientes.length; i++){
                    clientes[i] = clienteNuevo;
                    break;
                }



                break;
            case 2:
            case 3:
            case 4:
            case 5:


        }
    }

}
