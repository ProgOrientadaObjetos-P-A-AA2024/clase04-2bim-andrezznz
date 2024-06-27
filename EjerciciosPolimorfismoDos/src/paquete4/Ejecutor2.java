/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        int opc;

        /*ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }
        
        CentroComercial centro = new CentroComercial("La Pradera", 
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);*/
        do {

            System.out.println("\n------------------------------------");
            System.out.println(" Arriendo Local Comercial         [1]");
            System.out.println(" Arriendo Local Comida            [2]");
            System.out.println(" Arriendo Local Sesiones          [3]");
            System.out.println(" Presentar Lista Arrendatarios    [4]");
            System.out.println(" Salir                            [0]");
            opc = leer.nextInt();
            System.out.println("--------------------------------------");
            if (opc == 0) {
                break;
            }
            switch (opc) {
                case 1:
                    System.out.print(" Veces a Iterar:    ");
                    int veces = leer.nextInt();
                    for (int i = 0; i < veces; i++) {
                        System.out.print(" Nombre Arrendatario:   ");
                        String nombreArrendatario = leer.nextLine();
                        leer.nextLine(); // buffer
                        System.out.print(" Arriendo Mensual:    ");
                        double arriendoMensual = leer.nextDouble();
                        System.out.print(" Cuota Base:   ");
                        double cuotaBase = leer.nextDouble();
                        System.out.print(" Valor Adicional Fijo:    ");
                        double valorAdicionalFijo = leer.nextDouble();

                        ArriendoLocalComercial arriendoComercial
                                = new ArriendoLocalComercial(nombreArrendatario,
                                        cuotaBase);
                        arriendoComercial.establecerValorAdicionalFijo(valorAdicionalFijo);

                        listaArriendos.add(arriendoComercial);
                    }
                    break;
                case 2:
                    System.out.print(" Veces a Iterar:    ");
                    int vece = leer.nextInt();
                    for (int i = 0; i < vece; i++) {
                        System.out.print(" Nombre Arrendatario:   ");
                        String nombreArrendatario = leer.nextLine();
                        leer.nextLine(); // buffer
                        System.out.print(" Arriendo Mensual:    ");
                        double arriendoMensual = leer.nextDouble();
                        System.out.print(" Cuota Base:   ");
                        double cuotaBase = leer.nextDouble();
                        System.out.print(" Valor Luz:    ");
                        double valorLuz = leer.nextDouble();
                        System.out.print(" Valor Agua:    ");
                        double valorAgua = leer.nextDouble();
                        System.out.print(" Valor IVA:    ");
                        double iva = leer.nextDouble();

                        ArriendoLocalComida arriendoComida
                                = new ArriendoLocalComida(nombreArrendatario, cuotaBase);

                        arriendoComida.establecerIva(iva);
                        arriendoComida.establecerValorAgua(valorAgua);
                        arriendoComida.establecerValorLuz(valorLuz);

                        listaArriendos.add(arriendoComida);
                    }
                    break;
                case 3:
                    System.out.print(" Veces a Iterar:    ");
                    int vecs = leer.nextInt();
                    System.out.println("--------------------------------------");
                    for (int i = 0; i < vecs; i++) {
                        System.out.print(" Nombre Arrendatario:   ");
                        String nombreArrendatario = leer.nextLine();
                        leer.nextLine(); // buffer
                        System.out.print(" Arriendo Mensual:    ");
                        double arriendoMensual = leer.nextDouble();
                        System.out.print(" Cuota Base:   ");
                        double cuotaBase = leer.nextDouble();
                        System.out.print(" Valor Sillas:    ");
                        double valorSillas = leer.nextDouble();
                        System.out.print(" Valor Amplificacion:    ");
                        double valorAmplificacion = leer.nextDouble();

                        ArriendoLocalSesiones arriendoSesiones
                                = new ArriendoLocalSesiones(nombreArrendatario,
                                        cuotaBase);

                        arriendoSesiones.establecerValorSillas(valorSillas);
                        arriendoSesiones.establecerValorAmplificacion(valorAmplificacion);

                        listaArriendos.add(arriendoSesiones);
                    }
                    break;
                case 4:
                    System.out.print(" Nombre Centro Comercial:     ");
                    String nombre = leer.nextLine();

                    for (int i = 0; i < listaArriendos.size(); i++) {
                        listaArriendos.get(i).establecerArriendoMensual();
                    }
                    CentroComercial centro = new CentroComercial(nombre,
                            listaArriendos);
                    centro.establecerTotalArriendosBaseMensual();
                    centro.establecerTotalArriendosFinalMensual();
                    System.out.println(centro);
                    break;
            }
        } while (opc != 0);
    }
}
