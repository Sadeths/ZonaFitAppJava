package zona_fit.presentacion;

import java.util.Scanner;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        //Creamos un objeto de la clase clienteDao
        IClienteDAO clienteDao = new ClienteDAO();
        while(!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar clientes
                2. Buscar clientes
                3. Agregar cliente
                4. Modificar cliente
                5. Eliminar cliente 
                6. Salir 
                Elige una opcion:\s""");
            return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDAO){
        var salir = false;
        switch(opcion){
            case 1 -> { //1. Listar clientes 
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }

            case 2 -> {//2. Buscar cliente por ID
                System.out.print("Introduce el id del Cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if(encontrado){
                    System.out.println("Cliente encontrado: " + cliente);
                }else {
                    System.out.println("Cliente NO encontrado: " + cliente);
                }
            }
            case 3 -> {//3. Agregar cliente
                System.out.println("--- Agregar Cliente ---");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                //Creamos el cliente sin el ID
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if(agregado){
                    System.out.println("Cliente agregado: " + cliente);
                }else {
                    System.out.println("Cliente NO agregado: " + cliente);
                }
            }
            case 4 -> {//4. Modificar Cliente
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: " );
                var membresia = Integer.parseInt(consola.nextLine());
                //Creamos el objeto a modificar
                var cliente = new Cliente(idCliente, nombre, apellido, membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if(modificado){
                    System.out.println("Cliente modificado: " + cliente);
                }else {
                    System.out.println("Cliente NO modficado: " + cliente);
                }

            }
            case 5 -> {//5. Eliminar cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("ID Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if(eliminado){
                    System.out.println("Cliente eliminado: " + cliente);
                } else {
                    System.out.println("Cliente NO eliminado: " + cliente);
                }
            }
            case 6 -> {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida: " + opcion);

        }
        return salir;
    }
}




