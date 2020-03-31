package atv1;

import java.util.Scanner;
import java.util.Random;
public class Atv1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Robo r1 = new Robo("Preto");

        System.out.println("---Digite a posicao do alimento---");
        System.out.println("Posicao do eixo X: ");
        int a = teclado.nextInt();
        
        System.out.println("Posicao do eixo Y: ");
        int b = teclado.nextInt();
        r1.encontrou(a,b);

        System.out.println("=======================================");
        System.out.println("Agora faca o robo chegar até o alimento!");
        System.out.println("1 - UP");
        System.out.println("2 - DOWN");
        System.out.println("3 - RIGHT");
        System.out.println("4 - LEFT");
        System.out.println("Objetivo: ("+a+","+b+")");
        System.out.println("=======================================");

        int i = 1;
        while(!r1.encontrou(a,b)){
            int m = teclado.nextInt();
            r1.mover(m);
           }
    
    }
}