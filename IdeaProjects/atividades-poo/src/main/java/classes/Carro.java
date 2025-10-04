package classes;

public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private int ano;

    public void setCor(String cor){this.cor = cor;}
    public String getCor(){return cor;}

    public void setMarca(String marca){this.marca = marca;}
    public String getMarca(){return marca;}

    public void setModelo(String modelo){this.modelo = modelo;}
    public String getModelo(){return modelo;}

    public void setAno(int ano){this.ano = ano;}
    public int getAno(){return ano;}


    public void andar() {
        System.out.println("O carro " + modelo + " está andando 🚗🍃🚗🍃");
    }

    public void buzinar() {
        System.out.println("bibibibi");
    }

    public void frear() {
        System.out.println("O carro " + modelo + " Freou bruscamente");
    }

    public void mostrarDados() {
        System.out.println("Modelo: " + modelo + "\nMarca: " + marca + "\nCor: " + cor + "\nAno: " + ano + "\n");
    }
}
