/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Y.Morales
 */
public class ArrayClass {

    //ArrayList<String> lista;
    //ArrayList<String> listaColab;
    public static void main(String[] args) {
        Dia(args);
        // ArrayClass miLista = new ArrayClass();
        //miLista.lista = new ArrayList();
        // miLista.listaColab=new ArrayList();
        // miLista.leeropcion();

    }

    public static void Dia(String[] args) {
        /* String dia,fechacrea1;
                                        String mes;
                                        String año;
                                        String barra = "/";
                                        java.util.Date fecha = new Date();
                                        dia = String.valueOf(fecha.getDay());
                                        mes = String.valueOf(fecha.getMonth());
                                        año = String.valueOf(fecha.getYear());
                                        fechacrea1 = dia + barra + mes + barra + año;
                                        System.out.println(fechacrea1);*/
;
        LocalDate ahora = LocalDate.now();
        System.out.print(ahora);


    }
}

/*public void leeropcion() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
//Menu
        while (!salir) {

            System.out.println("1-Registro de Puestos");
            System.out.println("2-Registro de Clientes");
            System.out.println("3-Registro de Colaboradores");
            System.out.println("4-Registro de proyectos");
            System.out.println("5-Reportes");
            System.out.println("6-Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    //Agregar puestos
                    case 1:
                        Scanner teclado = new Scanner(System.in);
                        int opcion2;
                        do {
                            System.out.println("Escoga una opcion");
                            System.out.println("1.Agregar Puesto");
                            System.out.println("2.Modificar elemento de Puesto");
                            System.out.println("3.Eliminar elemento de Puesto");
                            System.out.println("4.Regresar");
                            opcion2 = teclado.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ingresarvalor();
                                    break;
                                case 2:
                                    modificarvalor();
                                    break;                              
                                case 3:
                                    eliminarvalor();
                                    break;                                
                                case 4:
                                    salir = true;
                                    break;
                            }

                        } while (opcion2 != 7);
                        break;
                    case 2:
                        
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

    }

    public void ingresarvalor() {
        String PM = "PM";
        String LP = "LP";
        String D = "D";
        String QA = "QA";
        String Sigl;
        String Dnomb;
        String DSal;
        String DSigl;

        Scanner nombre = new Scanner(System.in);
        System.out.print("Digite las siglas del puesto a agregar(PM,LP,D,QA):");
        Sigl = nombre.nextLine();

        puestos datosPuesto = new puestos();

        if ("PM".equals(Sigl)) {
            datosPuesto.setSiglas(Sigl);
            datosPuesto.setNombre("Gerente de Proyecto");
            datosPuesto.setSalario("$4500");
            datosPuesto.setSiglas(Sigl);
            Dnomb = datosPuesto.getNombre();
            DSal = datosPuesto.getSalario();
            DSigl = datosPuesto.getSiglas();
            lista.add(Dnomb);
            lista.add(DSal);
            lista.add(DSigl);

        } else {
            if (Sigl.equals(LP)) {
                datosPuesto.setNombre("Lider de Proyecto");
                datosPuesto.setSalario("$3900");
                datosPuesto.setSiglas(Sigl);
                Dnomb = datosPuesto.getNombre();
                DSal = datosPuesto.getSalario();
                DSigl = datosPuesto.getSiglas();
                lista.add(Dnomb);
                lista.add(DSal);
                lista.add(DSigl);

            } else {
                if (Sigl.equals(D)) {
                    datosPuesto.setNombre("Desarrollador");
                    datosPuesto.setSalario("$3000");
                    datosPuesto.setSiglas(Sigl);
                    Dnomb = datosPuesto.getNombre();
                    DSal = datosPuesto.getSalario();
                    DSigl = datosPuesto.getSiglas();
                    lista.add(Dnomb);
                    lista.add(DSal);
                    lista.add(DSigl);

                } else {
                    if (Sigl.equals(QA)) {
                        datosPuesto.setNombre("Aseguramiento de la calidad ");
                        datosPuesto.setSalario("$2300");
                        datosPuesto.setSiglas(Sigl);
                        Dnomb = datosPuesto.getNombre();
                        DSal = datosPuesto.getSalario();
                        DSigl = datosPuesto.getSiglas();
                        lista.add(Dnomb);
                        lista.add(DSal);
                        lista.add(DSigl);

                    }
                }
            }

        }

    }

    public void modificarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor, nuevovalor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = teclado.nextLine();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Nuevo valor");
            nuevovalor = teclado.nextLine();
            lista.set(indice, nuevovalor);
        } else {
            System.out.println("Dato no se encuentra en lista");
        }

    }

    public void eliminarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor, nuevovalor;
        int indice;
        System.out.print("Valor a eliminar: ");
        valor = teclado.nextLine();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato eliminado");
            lista.remove(indice);
        } else {
            System.out.println("Dato no se encuentra en lista");
        }
    }


    public void mostrarvalores() {
        if (!lista.isEmpty()) {
            System.out.println("Elementos de la lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("No hay valores en lista");

        }
    }
    public void ingresarvalorcolab() {
        
    }
}
    

    /*public static void Menys(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
//Menu
        while (!salir) {

            System.out.println("1-Registro de Puestos");
            System.out.println("2-Registro de Clientes");
            System.out.println("3-Registro de Colaboradores");
            System.out.println("4-Registro de proyectos");
            System.out.println("5-Reportes");
            System.out.println("6-Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    //Agregar puestos
                    case 1:
                        main(args);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
class ArrayColaboradores {

    ArrayList<String> lista;

    public static void main(String[] args) {
        ArrayClass miLista = new ArrayClass();
        miLista.lista = new ArrayList();
        miLista.leeropcion();
    }

    public void leeropcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Escoga una opcion");
            System.out.println("1.Agregar");
            System.out.println("2.Buscar");
            System.out.println("3.Modificar elemento");
            System.out.println("4.Eliminar elemento");
            System.out.println("5.Insertar elemento");
            System.out.println("5.Mostrar elemento");
            System.out.println("5.Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ingresarvalor();
                    break;
                case 2:
                    buscarvalor();
                    break;
                case 3:
                    modificarvalor();
                    break;
                case 4:
                    insertarvalor();
                    break;
                case 5:
                    eliminarvalor();
                    break;
                case 6:
                    mostrarvalores();
                    break;
            }

        } while (opcion != 7);
    }

    public void ingresarvalor() {
        String PM = "PM";
        String LP = "LP";
        String D = "D";
        String QA = "QA";
        String Sigl;
        String Dnomb;
        String DSal;
        String DSigl;

        Scanner nombre = new Scanner(System.in);
        System.out.print("Digite las siglas del puesto a agregar(PM,LP,D,QA):");
        Sigl = nombre.nextLine();

        puestos datosPuesto = new puestos();

        if ("PM".equals(Sigl)) {
            datosPuesto.setSiglas(Sigl);
            datosPuesto.setNombre("Gerente de Proyecto");
            datosPuesto.setSalario("$4500");
            datosPuesto.setSiglas(Sigl);
            Dnomb = datosPuesto.getNombre();
            DSal = datosPuesto.getSalario();
            DSigl = datosPuesto.getSiglas();
            lista.add(Dnomb);
            lista.add(DSal);
            lista.add(DSigl);

        } else {
            if (Sigl.equals(LP)) {
                datosPuesto.setNombre("Lider de Proyecto");
                datosPuesto.setSalario("$3900");
                datosPuesto.setSiglas(Sigl);
                Dnomb = datosPuesto.getNombre();
                DSal = datosPuesto.getSalario();
                DSigl = datosPuesto.getSiglas();
                lista.add(Dnomb);
                lista.add(DSal);
                lista.add(DSigl);

            } else {
                if (Sigl.equals(D)) {
                    datosPuesto.setNombre("Desarrollador");
                    datosPuesto.setSalario("$3000");
                    datosPuesto.setSiglas(Sigl);
                    Dnomb = datosPuesto.getNombre();
                    DSal = datosPuesto.getSalario();
                    DSigl = datosPuesto.getSiglas();
                    lista.add(Dnomb);
                    lista.add(DSal);
                    lista.add(DSigl);

                } else {
                    if (Sigl.equals(QA)) {
                        datosPuesto.setNombre("Aseguramiento de la calidad ");
                        datosPuesto.setSalario("$2300");
                        datosPuesto.setSiglas(Sigl);
                        Dnomb = datosPuesto.getNombre();
                        DSal = datosPuesto.getSalario();
                        DSigl = datosPuesto.getSiglas();
                        lista.add(Dnomb);
                        lista.add(DSal);
                        lista.add(DSigl);

                    }
                }
            }

        }

    }

    public void buscarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor, nuevovalor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = teclado.nextLine();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posicion" + indice);
        } else {
            System.out.println("Dato no se encuentra en lista");
        }

    }

    public void modificarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor, nuevovalor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = teclado.nextLine();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Nuevo valor");
            nuevovalor = teclado.nextLine();
            lista.set(indice, nuevovalor);
        } else {
            System.out.println("Dato no se encuentra en lista");
        }

    }

    public void eliminarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor, nuevovalor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = teclado.nextLine();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato eliminado");
            lista.remove(indice);
        } else {
            System.out.println("Dato no se encuentra en lista");
        }
    }

    public void insertarvalor() {
        Scanner teclado = new Scanner(System.in);
        String valor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = teclado.nextLine();
        System.out.print("posicion donde desea insertar: ");
        indice = teclado.nextInt();
        lista.add(indice, valor);

    }

    public void mostrarvalores() {
        if (!lista.isEmpty()) {
            System.out.println("Elementos de la lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("No hay valores en lista");

        }
    }

}
 */
