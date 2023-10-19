package aula02.classes;

public class PersonaInical {
    private String nome;
    private Integer idade;
    private double altura;
    private double peso;
    private String cpf;

    public PersonaInical(String nome, Integer idade, double altura, double peso, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    public PersonaInical(String nome, Integer idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = null;
    }

    public PersonaInical() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String ola(){
        return "Olá eu sou uma persona";
    }
}
