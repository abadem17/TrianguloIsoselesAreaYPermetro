package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado1,base;
        int ntriangulos,indiceBase=0;

        System.out.print("Numero de triangulos: ");
        ntriangulos = entrada.nextInt();
        Triangulo [] triangulo = new Triangulo[ntriangulos];

        for (int i = 0; i < triangulo.length; i++) {
            System.out.println("Digite los datos del triangulo isoseles: ");
            System.out.print("Lado 1: ");
            lado1 = entrada.nextDouble();
            System.out.print("Base: ");
            base = entrada.nextDouble();

            triangulo[i] = new Triangulo(lado1,base);

            triangulo[i].calcularAltura();

        }

        for (int i = 1; i <triangulo.length ; i++) {
            if (triangulo[i-1].getBase() < triangulo[i].getBase()){
                indiceBase = i;
            }
        }
        System.out.println(triangulo[indiceBase].mostrarDatos());
    }
}
