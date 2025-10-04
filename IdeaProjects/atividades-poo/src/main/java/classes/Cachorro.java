package classes;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

//    Método para setar o nome
    public void setNome(String nome){this.nome = nome;}

//    Método para pegar o valor do nome
    public String getNome(){return nome;}


    public void setRaca(String raca){this.raca = raca;}
    public String getRaca(){return raca;}

    public void setIdade(int idade){this.idade = idade;}
    public int getIdade(){return idade;}

    public void mostrarDados() {
        System.out.println("Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade);
    }
}
