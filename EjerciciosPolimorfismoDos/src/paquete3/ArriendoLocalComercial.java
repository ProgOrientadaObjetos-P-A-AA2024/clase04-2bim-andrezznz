/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Arriendo;

/**
 *
 * @author reroes
 */
public class ArriendoLocalComercial extends Arriendo {

    protected double valorAdicionalFijo;

    public ArriendoLocalComercial(String nombre, double cuotaB) { 
        // pasarela de la subaClase hasta el constructor de la SuperClase
        super(nombre, cuotaB);
    }

    @Override
    public void establecerNombreArrendatario(String nombre) {
        nombreArrendatario = nombre.toUpperCase(); // se esta personalizando (opcional en funcion del contexto)
    }

    public void establecerValorAdicionalFijo(double x) {
        valorAdicionalFijo = x;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = obtenerCuotaBase() + obtenerValorAdicionalFijo();
    }

    public double obtenerValorAdicionalFijo() {
        return valorAdicionalFijo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Ariendo de Local Comercial\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor adicional fijo: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorAdicionalFijo(),
                obtenerArriendoMensual());

        return cadena;
    }
}
