import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float metros, centimetros;
        System.out.println("Digite o valor em metros: ");
        metros = input.nextFloat();
    
        centimetros = metros * 100; 
        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
    }

}

