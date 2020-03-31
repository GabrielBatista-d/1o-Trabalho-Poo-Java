package atv1;
import java.util.Scanner;
import java.util.Random;
/*Crie outra classe Main que instancie dois robôs, peça ao usuário para entrar com a
posição do alimento, e faça os dois robôs se moverem randomicamente, um de cada vez,

até que um deles encontre o alimento. Ao final, mostre quem achou o alimento e o
número de movimentos que cada robô fez.*/
public class Main2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Digite a cor do primeiro robô");
        String c = teclado.nextLine();
        Robo r1 = new Robo(c);
        
        System.out.println("Digite a cor do segundo robô");
        c = teclado.nextLine();
        Robo r2 = new Robo(c);
        
        System.out.println("---Digite a posicao do alimento---");
        System.out.println("Posicao do eixo X: ");
        int a = teclado.nextInt();
        
        System.out.println("Posicao do eixo Y: ");
        int b = teclado.nextInt();
        r1.encontrou(a,b);
        r2.encontrou(a,b);
        
        int aux=0;
        while(!r1.encontrou(a,b)&&!r2.encontrou(a,b)){
            r1.mover(random.nextInt(4)+1);
            r2.mover(random.nextInt(4)+1);
            
            aux++;
        }
        System.out.println("Numero de tentativas: "+aux);
    }
}
