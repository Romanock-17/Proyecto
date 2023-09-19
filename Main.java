import javax.swing.*;
import java.util.Scanner;


        import javax.swing.*;
        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int opcion, dato = 0;
                Lista nuevaLista1 = new Lista();
                Lista nuevaLista2 = new Lista();
                Lista nuevaLista3 = new Lista();
                Scanner scan = new Scanner(System.in);

                do {
                    String menu = "Menú:\n" +
                            "1. Insertar al inicio\n" +
                            "2. Insertar al final\n" +
                            "3. Mostrar lista\n" +
                            "4. Ordenar\n" +
                            "5. Insertar Ordenado \n"+
                            "6. Sumar listas\n"+
                            "7. Buscar\n"+
                            "8. Reemplazar\n"+
                            "9. Eliminar\n"+
                            "10. Distributiva\n"+
                            "11. Intercalado\n"+
                            "12. Salir";

                    String opcio = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    opcion = Integer.parseInt(opcio);

                    switch (opcion) {
                        case 1:
                            String listaInput = JOptionPane.showInputDialog("¿En que lista desea insertar?:\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n" );
                            int opc = Integer.parseInt(listaInput);
                            String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                            dato = Integer.parseInt(datoInput);
                            if (opc == 1) nuevaLista1.insertarInicio(dato);
                            if (opc == 2) nuevaLista2.insertarInicio(dato);
                            break;
                        case 2:
                            String insertarfinal = "¿En qué lista desea insertar?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String opcionInsertarFinal = JOptionPane.showInputDialog(null, insertarfinal, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int listaInsertarFinal = Integer.parseInt(opcionInsertarFinal);

                            String datoInputFinal = JOptionPane.showInputDialog("Inserte el dato");
                            dato = Integer.parseInt(datoInputFinal);

                            if (listaInsertarFinal == 1) nuevaLista1.insertarFinal(dato);
                            if (listaInsertarFinal == 2) nuevaLista2.insertarFinal(dato);

                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Lista 1:\n");
                            nuevaLista1.mostrarLista();
                            JOptionPane.showMessageDialog(null, "Lista 2:\n");
                            nuevaLista2.mostrarLista();
                            break;
                        case 4:
                            String ordenar = "¿Qué lista desea ordenar?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String opcionordenar = JOptionPane.showInputDialog(null, ordenar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int listaordenar = Integer.parseInt(opcionordenar);
                            if (listaordenar == 1) nuevaLista1.ordenar();
                            if (listaordenar == 2) nuevaLista2.ordenar();
                            break;
                        case 5:
                            String Insertarordenado = "¿En qué lista desea insertar ordenado?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String opcioninsertarordenado = JOptionPane.showInputDialog(null, Insertarordenado, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int insertarOrde = Integer.parseInt(opcioninsertarordenado);
                            String listainsertarordando = JOptionPane.showInputDialog("Ingrese el dato");
                            dato = Integer.parseInt(listainsertarordando);
                            if (insertarOrde == 1) nuevaLista1.insertarOrdenado(dato);
                            if (insertarOrde == 2) nuevaLista2.insertarOrdenado(dato);
                            break;
                        case 6:
                            nuevaLista3 = new Lista();
                            JOptionPane.showMessageDialog(null, "La suma de listas es: ");
                            nuevaLista3.sumarListas(nuevaLista1, nuevaLista2);
                            nuevaLista3.mostrarLista();
                        break;
                        case 7:
                            String Busqueda = "¿En qué lista desea buscar?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String buscar = JOptionPane.showInputDialog(null, Busqueda, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int Datobuscar = Integer.parseInt(buscar);
                            String DatoBuscar = JOptionPane.showInputDialog("Ingrese el dato");
                            dato = Integer.parseInt(DatoBuscar);
                            if (Datobuscar == 1) nuevaLista1.Busqueda(dato);
                            if (Datobuscar == 2) nuevaLista2.Busqueda(dato);
                        break;

                        case 8:
                            String Reemplazar = "¿En qué lista desea reemplazar?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String opci = JOptionPane.showInputDialog(null, Reemplazar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int ListaReemplazar = Integer.parseInt(opci);
                            String DatoReemplazo = JOptionPane.showInputDialog("Ingrese el dato a reemplazar");
                            dato = Integer.parseInt(DatoReemplazo);
                            String Nuevo =JOptionPane.showInputDialog("Ingrese el dato nuevo");
                            int nuevoDato=Integer.parseInt(Nuevo);
                            if (ListaReemplazar == 1) nuevaLista1.Reemplazar(dato, nuevoDato);
                            if (ListaReemplazar == 2) nuevaLista2.Reemplazar(dato, nuevoDato);
                        break;

                        case 9:
                            String Eliminar = "¿En qué lista desea eliminar?\n" +
                                    "1. Lista 1\n" +
                                    "2. Lista 2\n";
                            String op = JOptionPane.showInputDialog(null, Eliminar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                            int ListaEliminar = Integer.parseInt(op);
                            String DatoEliminar = JOptionPane.showInputDialog("Ingrese dato a eliminar");
                            dato = Integer.parseInt(DatoEliminar);
                            if (ListaEliminar == 1) nuevaLista1.Eliminar(dato);
                            if (ListaEliminar == 2) nuevaLista2.Eliminar(dato);
                        break;

                        case 10:
                            nuevaLista3 = new Lista();
                            nuevaLista3.Distribuir(nuevaLista1,nuevaLista2);
                            nuevaLista3.mostrarLista();
                        break;

                        case 11:
                            nuevaLista3=new Lista();
                            nuevaLista3.intercalar(nuevaLista1,nuevaLista2);
                            nuevaLista3.mostrarLista();
                        break;
                        case 12:
                           JOptionPane.showMessageDialog(null, "Salir");
                           break;
                    }
                } while (opcion != 12);

                scan.close();
            }
        }



