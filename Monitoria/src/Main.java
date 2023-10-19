import aula02.classes.FuncaoTrabalhorImplementada;
import aula02.classes.PersonaInical;
import aula02.classes.Trabalhador;
import aula02.interfaces.FuncaoTrabalhador;

public class Main {
    public static void main(String[] args) {
        /*
        * Aula 01
        * */

        //Objetos diferentes.
//        Carro carro = new Carro(4, "VERMELHO", "v1");
//        Carro carroMaior = new Carro();
//
//        //Deverá aparecer 100 para ambos, pois é um atributo estático, é sempre igual para todos que usam.
//        System.out.println("Velocidade carro 1: " + carro.valocidadeMaxima);
//        System.out.println("Velocidade carro maior: " + carroMaior.valocidadeMaxima);
//
//        //Não precisa criar objeto(Instancia), precisa só dizer onde está localizado.
//        Carro.alterarVelocidade(150);
//        System.out.println("=========================================================");
//        //Valor após alteração usando método estático, devem 150 pois o atributo divide o mesmo local na memória.
//        System.out.println("Velocidade carro 1: " + carro.valocidadeMaxima);
//        System.out.println("Velocidade carro maior: " + carroMaior.valocidadeMaxima);


//        System.out.println("Cor :" + carro.getCor());
//        System.out.println("Pneus :" + carro.pegarPneus());
//        carro.enviarPneus(6);
//        System.out.println("Pneus alterados:" + carro.pegarPneus());
//        System.out.println("Acentos :" + carro.getQuantidadeAcentos());


        /*
         * Aula 02
         * */

        PersonaInical persona = new PersonaInical();
        Trabalhador trabalhador = new Trabalhador("001", "12 dias", "004", "programador");


        //persona.getCpf(); // <== Existe dentro do objeto persona inicial
        //persona.getCarteiraTrabalho(); <== Não existe dentro do objeto PersonaInicial
//        System.out.println(trabalhador.getCargo());//Vai aparecer pois foi setado;
//        System.out.println(persona.ola());
//        System.out.println(trabalhador.ola());
//        System.out.println(trabalhador.ola("jornalista"));

        PersonaInical diarista = new Trabalhador("001", "12 dias", "004", "programador");//Restringe o comportamento apenas para Pessoa.
//        System.out.println(diarista.getINSS()); <== Não tem acesso, pois se trata de uma pessoa.
//        Trabalhador tester = new PersonaInical(); <== Não pode, pois nem toda persona é um trabalhador.

        FuncaoTrabalhorImplementada funcao = new FuncaoTrabalhorImplementada();

//        System.out.println(funcao.digaOla());//Chamando o método definido na interface e implementado na classe.
//        System.out.println(funcao.digaTchau());//Chamando o método definido na interface e implementado na classe.

        FuncaoTrabalhador funcaoDois = new FuncaoTrabalhorImplementada();
        System.out.println(funcaoDois.digaOla());//Busca a interface, e depois a implementação da interface.

    }



}