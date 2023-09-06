package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem=parametroDois-parametroUm;
        if (parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }else {
            for (int i=1;i<=contagem;i++){
                System.out.println(i);
            }
        }
    }
}