import Classes.Carro;

public class Main {
    public static void main(String[] args) {

        //Objetos diferentes.
        Carro carro = new Carro(4, "VERMELHO", "v1");
        Carro carroMaior = new Carro();

        //Deverá aparecer 100 para ambos, pois é um atributo estático, é sempre igual para todos que usam.
        System.out.println("Velocidade carro 1: " + carro.valocidadeMaxima);
        System.out.println("Velocidade carro maior: " + carroMaior.valocidadeMaxima);

        //Não precisa criar objeto(Instancia), precisa só dizer onde está localizado.
        Carro.alterarVelocidade(150);
        System.out.println("=========================================================");
        //Valor após alteração usando método estático, devem 150 pois o atributo divide o mesmo local na memória.
        System.out.println("Velocidade carro 1: " + carro.valocidadeMaxima);
        System.out.println("Velocidade carro maior: " + carroMaior.valocidadeMaxima);


//        System.out.println("Cor :" + carro.getCor());
//        System.out.println("Pneus :" + carro.pegarPneus());
//        carro.enviarPneus(6);
//        System.out.println("Pneus alterados:" + carro.pegarPneus());
//        System.out.println("Acentos :" + carro.getQuantidadeAcentos());
    }



}