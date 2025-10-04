package classes;

public class ValidarIdade {
    private String nome;
    private int idade;

    public void setIdade(int anoNascimento, int anoAtual){this.idade = (anoAtual - anoNascimento);}
    public int getIdade(){return idade;}

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}
}
