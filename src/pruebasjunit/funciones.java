/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasjunit;

/**
 *
 * @author Laura
 */
public class funciones {

    public static int resultado = 0;

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        resultado = a - b;
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        double res = (double) a / (double) b;
        return res;
    }

    public static boolean esPositivo(int x) {
        if (x < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int mayor(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

/* public static double dividir(int a, int b) {
        double res = (double) a / (double)b;
        return res;
    }*/
