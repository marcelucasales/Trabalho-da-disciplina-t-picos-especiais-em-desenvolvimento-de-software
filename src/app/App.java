package app;

import java.util.Scanner;
import pacote.Carro;
import pacote.Menu;

public class App {

    public static void main(String[] args) throws Exception {
        int indice = 0;
        Scanner ler = new Scanner(System.in);
        Carro[] oficina = new Carro[30];
        while(true) {
            Menu.start();
            int aux = ler.nextInt();
            switch(aux) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if(indice == 30) {
                        System.out.println("Não existe mais vagas!");
                    } else {
                        Menu.executaUm(oficina, indice++, ler);
                    }
                    break;
                case 2:
                    Menu.executaDois(ler, oficina, indice);
                    break;
                case 3:
                    indice = Menu.executaTr(oficina, indice, ler);
                    break;
                case 4:
                    Menu.executaQuat(oficina, indice);
                    break;
                case 5:
                    System.out.println("Existe " + indice +" vaga(s) ocupada(s)\nExiste " + (30 - indice) +" vaga(s) livre(s)");
                    break;
                default:
                    break;
            }
        }
    }
}