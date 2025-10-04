package org.example;
import java.util.Scanner;
import java.time.Year;
import classes.Cachorro;
import classes.Carro;
import classes.ValidarIdade;


class Produto {
    String produto;
    String marca;
    String modelo;
    double tempoUso;
    double valor;

    public void funcionalidade() {
        System.out.println("Funcionando");
    }

    public void mostrarProduto() {
        System.out.println("produto: " + produto + "\nmarca: " + marca + "\nModelo: " + modelo + "\nTempo De Uso: " + tempoUso + "\nValor: " + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Classe direto no arquivo
        Produto produto1 = new Produto();
        produto1.produto = "Celular";
        produto1.marca = "Iphone";
        produto1.modelo = "16";
        produto1.tempoUso = 1.0;
        produto1.valor = 4900;
        produto1.funcionalidade();
        produto1.mostrarProduto();

        System.out.println("\nTreinando Classes com Carro\n");

//        Classe com encapsulamento
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setMarca("Lamborghini");
        carro1.setModelo("Urus");
        carro1.setAno(2024);
        System.out.println("Marca: " + carro1.getMarca() + "\nModelo: " + carro1.getModelo() + "\nCor: " + carro1.getCor() + "\nAno: " + carro1.getAno());
        System.out.println("\n");
        carro1.andar();
        carro1.frear();
        carro1.buzinar();
        carro1.mostrarDados();

        Carro carro2 = new Carro();
        carro2.setCor("Vermelho");
        carro2.setMarca("Volkswagen");
        carro2.setModelo("Fusca");
        carro2.setAno(2000);
        System.out.println("Marca: " + carro2.getMarca() + "\nModelo: " + carro2.getModelo() + "\nCor: " + carro2.getCor() + "\nAno: " + carro2.getAno());
        System.out.println("\n");
        carro2.andar();
        carro2.frear();
        carro2.buzinar();
        carro2.mostrarDados();



        System.out.println("Treinando Classes com Cachorro\n");
        Cachorro dog1 = new Cachorro();
        dog1.setNome("Dog 1");
        dog1.setIdade(10);
        dog1.setRaca("Golden");

        System.out.println("Nome: " + dog1.getNome() + "\nIdade: " + dog1.getIdade() + "\nRaça: " + dog1.getRaca());
        System.out.println("\n");


        System.out.println("\n\n\n Testando Encapsulamento \n\n\n");

        ValidarIdade pessoa = new ValidarIdade();

        System.out.println("Olá, vamos calcular a sua idade para verificar se você pode ou não tirar carta\n");
        System.out.println("Para começar, Digite o seu nome: ");
        String nomePessoa = scanner.next(); // le o que foi digitado esperando como texto, sem conversão

        pessoa.setNome(nomePessoa); // passa o valor da variável para o classe ValidarIdade, e atribui como parametro para o método que receberá o nome, para o tratamento

        System.out.println("Agora digite o ano em que nasceu: ");
        int anoNascimento = scanner.nextInt(); // Le o que foi digitado e transforma em inteiro

        int anoAtual = Year.now().getValue(); // Pega o ano atual;


        pessoa.setIdade(anoNascimento, anoAtual);

        System.out.println(pessoa.getNome() + " Como estamos em " + anoAtual + " baseando-se nos calculos verificamos que Você tem " + pessoa.getIdade() + " anos, então");

        if(pessoa.getIdade() >= 18){
            System.out.println("já pode tirar a carta");
        }else{
            System.out.println("ainda não pode tirar carta, apenas com 18 anos");
        }

    }
}