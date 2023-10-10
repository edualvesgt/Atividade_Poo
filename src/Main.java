import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //final = const
        System.out.print("Digite Salario:");
        final float salario = leitor.nextFloat();

        if (salario < 1000) {

            var newSalario = salario * 1.1;

            System.out.println(newSalario);
        }

        else {
            System.out.println("Salario dentro da faixa");
        }
    }

}