package pacote;

import java.util.Random;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private String servico;
    private double valorServico;    

    public Carro() {}

    public Carro(String marca, String modelo, String placa) {
        this.id = new Random().nextInt(1000);
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getId() {
        return this.id;
    }

    public String getServico() {
        return this.servico;
    }

    public double getValorServico() {
        return this.valorServico;
    }

    public void SetMarca(String marca) {
        this.marca = marca;
    }

    public void SetModelo(String modelo) {
        this.modelo = modelo;
    }

    public void SetPlaca(String placa) {
        this.placa = placa;
    }

    public void SetServico(String servico) {
        this.servico = servico;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public void SetValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    @Override
    public String toString() {
        return "Id = "+this.id+"\n"+"Marca = "+this.marca+"\n"+"Modelo = "+this.modelo+"\n"+"Placa = "+this.placa+"\n"+"Servico = "+this.servico+"\n"+"Valor do serviço = "+this.valorServico+" reais"+"\n";
    }

}
