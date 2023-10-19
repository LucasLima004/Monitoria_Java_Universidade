package aula02.classes;

public class Trabalhador extends PersonaInical{
    private String carteiraTrabalho;
    private String tempoTrabalho;
    private String INSS;
    private String cargo;

    public Trabalhador(String nome, Integer idade, double altura, double peso, String cpf, String carteiraTrabalho, String tempoTrabalho, String INSS, String cargo) {
        super(nome, idade, altura, peso, cpf);// Chama o construtor da classe inferior(Base).
        this.carteiraTrabalho = carteiraTrabalho;
        this.tempoTrabalho = tempoTrabalho;
        this.INSS = INSS;
        this.cargo = cargo;
    }

    public Trabalhador(String nome, Integer idade, double altura, double peso, String carteiraTrabalho, String tempoTrabalho, String INSS, String cargo) {
        super(nome, idade, altura, peso);
        this.carteiraTrabalho = carteiraTrabalho;
        this.tempoTrabalho = tempoTrabalho;
        this.INSS = INSS;
        this.cargo = cargo;
    }

    public Trabalhador(String carteiraTrabalho, String tempoTrabalho, String INSS, String cargo) {
        super();
        this.carteiraTrabalho = carteiraTrabalho;
        this.tempoTrabalho = tempoTrabalho;
        this.INSS = INSS;
        this.cargo = cargo;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(String tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

    public String getINSS() {
        return INSS;
    }

    public void setINSS(String INSS) {
        this.INSS = INSS;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Sobrescreveu o método de dentro de PersonaInicial
    public String ola(){
        return "Olá eu sou um programador";
    }

    //Sobrecarga, mesmo nome, mesmo retorno, mesma visibilidade, mas com argumentos/parâmetros.
    public String ola(String funcao){
        return "Olá eu sou um " + funcao;
    }
}
