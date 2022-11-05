package pacote;

import java.util.Scanner;

public class Menu {
    
    public static void start() {
        System.out.println("O que você deseja fazer?");
        System.out.println("0 -> para encerrar.");
        System.out.println("1 -> para fazer a entrada do carro.");
        System.out.println("2 -> para lançar o serviço e o valor.");
        System.out.println("3 -> para liberação do carro.");
        System.out.println("4 -> para listar carros na oficina.");
        System.out.println("5 -> para listar vagas na oficina.");
    }

    public static void executaUm(Carro[] oficina, int indice, Scanner ler) {
        System.out.print("Digite o modelo do carro: ");
        String modelo = ler.next();
        System.out.print("Digite a marca do carro: ");
        String marca = ler.next();
        System.out.print("Digite a placa do carro: ");
        String placa = ler.next();
        oficina[indice] = new Carro(modelo, marca, placa);
        System.out.println("Esse é o seu id: " + oficina[indice].getId());
    }

    public static void executaDois(Scanner ler, Carro[] oficina, int indice) {
        boolean check = false;
        String servico;
        double valorServico;
        System.out.println("Quais dos serviços deseja fazer? Obs:. Se não selecionar nenhuma opção será feita a limpeza do ar condicionado por 20 reais!");
        System.out.println("1 -> Alinhamento dos pneus por 30 reais");
        System.out.println("2 -> Manutenção do filtro de combustível por 40 reais");
        System.out.println("3 -> Manutenção da correia dentada por 50 reais");
        System.out.println("4 -> Troca do fluido de freio por 60 reais");
        System.out.println("5 -> Mudança dos pneus por 70 reais");
        switch(ler.nextInt()) {
            case 1:
                servico = "Alinhamento dos pneus";
                valorServico = 30;
                break;
            case 2:
                servico = "Manutenção do filtro de combustível";
                valorServico = 40;
                break;
            case 3:
                servico = "Manutenção da correia dentada";
                valorServico = 50;
                break;
            case 4:
                servico = "Troca do fluido de freio";
                valorServico = 60;
                break;
            case 5:
                servico = "Mudança dos pneus";
                valorServico = 70;
                break;
            default:
                servico = "Limpeza do ar condicionado";
                valorServico = 20;
                break;
        }
        System.out.print("Por favor, digite o id do carro cadastrado: ");
        int id = ler.nextInt();
        for(int i = 0; i<indice;i++) {
            if(oficina[i].getId() == id) {
                oficina[i].SetServico(servico);
                oficina[i].SetValorServico(valorServico);
                check = true;
                break;
            }
            if(i == (indice-1)) { check = false; }
        }
        if(check) {
            System.out.println("Serviço solicitado com sucesso!");
        } else {
            System.out.println("Não existe esse carro na oficina");
        }
    }

    public static void executaQuat(Carro[] oficina, int indice) {
        if(indice == 0) {
            System.out.println("Não existe carros na oficina!");
        } else {
            for(int i = 0;i<indice;i++) {
                System.out.println(oficina[i]);
            }
        }
    }

    public static int executaTr(Carro[] oficina, int indice, Scanner ler) {
        int aux = 0;
        boolean check = false;
        System.out.print("Digite o id do carro que deseja liberar:");
        int id = ler.nextInt();
        for(int i = 0;i<indice;i++) {
            if(id == oficina[i].getId()) {
                System.out.println("Segue a fatura do carro liberado com os dados do carro, descrição do serviço e valor do serviço!");
                System.out.println(oficina[i]);
                if(i == (indice-1)) {
                    return (indice - 1);
                }
                check = true;
                aux = i;
                break;
            }
            if(i == (indice-1)) {
                check = false;
            }
        }
        if(check == false) {
            System.out.println("Carro não existe na oficina!");
            return indice;
        } else {
            for(int i = aux;i<indice-1;i++) {
                oficina[i] = oficina[i+1];
            }
            return (indice-1);
        }
    }

}
