package aula01.Classes;

public class Carro {
    private int quantidadPneus;
    private String cor;
    private String motor;
    private int quantidadeAcentos;

    public static int valocidadeMaxima = 100;// Vai ser mesmo para todas entidades que usarem.
    private final int valocidadeMinima = 0; //Constante

    //Construtor implicito
    public Carro() {

    }

    //Método static não precisa de instancia(Gerar objeto), pode só chamar
    public static void alterarVelocidade(int valor){
        valocidadeMaxima = valor;
    }

    //Construtor ==> Testa primeiro, se for o que está procurando irá executar
    public Carro(int quantidadPneu, String cor, String motor) {
        quantidadPneus = quantidadPneu;
        this.cor = cor; //Usa o this por ser mesmo nome( Referencia a ESTE atributo da classe.
        this.motor = motor;
        this.quantidadeAcentos = 5; //Valor padrão do construtor.
    }

    //Construtor de valor unico
    public Carro(int quantidadPneus) {
        this.quantidadPneus = quantidadPneus;
    }

    //Normalmente não é feito
//    public Carro(String quantidadPneus) {
//        this.quantidadPneus = (int) Integer.valueOf(quantidadPneus);
//    }

    public int pegarPneus() { //Get method
        return quantidadPneus;
    }

    public void enviarPneus(int quantidadPneu) {//Set method
        quantidadPneus = quantidadPneu; //Mesma ideia do this
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQuantidadeAcentos() {
        return quantidadeAcentos;
    }

    public void setQuantidadeAcentos(int quantidadeAcentos) {
        this.quantidadeAcentos = quantidadeAcentos;
    }
}
