package org.example;

class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade);
    }
}

class Carro {
    String cor;
    String marca;
    String modelo;
    int ano;

    void andar() {
        System.out.println("O carro " + modelo + " está andando 🚗🍃🚗🍃");
    }

    void buzinar() {
        System.out.println("bibibibi");
    }

    void frear() {
        System.out.println("O carro " + modelo + " Freou bruscamente");
    }

    void mostrarDados() {
        System.out.println("Modelo: " + modelo + "\nMarca: " + marca + "\nCor: " + cor + "\nAno: " + ano + "\n");
    }
}


class Produtos {
    String produto;
    String marca;
    String modelo;
    double tempoUso;
    double valor;

    void funcionalidade() {
        System.out.println("Funcionando");
    }

    void mostrarProduto() {
        System.out.println("produto: " + produto + "\nmarca: " + marca + "\nModelo: " + modelo + "\nTempo De Uso: " + tempoUso + "\nValor: " + valor);
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Azul";
        carro1.marca = "Lamborqhini";
        carro1.modelo = "urus";
        carro1.ano = 2024;
        carro1.andar();
        carro1.frear();
        carro1.buzinar();
        carro1.mostrarDados();

        Carro carro2 = new Carro();
        carro2.cor = "Vermelho";
        carro2.marca = "Volkswagen";
        carro2.modelo = "Fusca";
        carro2.ano = 2000;
        carro2.andar();
        carro2.frear();
        carro2.buzinar();
        carro2.mostrarDados();

        Produtos produto1 = new Produtos();
        produto1.produto = "Celular";
        produto1.marca = "Iphone";
        produto1.modelo = "16";
        produto1.tempoUso = 1.0;
        produto1.valor = 4900;
        produto1.funcionalidade();
        produto1.mostrarProduto();

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Spike";
        cachorro.raca = "Caramelo";
        cachorro.idade = 20;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Rex";
        cachorro2.raca = "Pitbull";
        cachorro2.idade = 10;


        cachorro.latir();
        cachorro.mostrarDados();

        cachorro2.latir();
        cachorro2.mostrarDados();


    }
}