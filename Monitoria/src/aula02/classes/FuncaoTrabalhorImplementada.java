package aula02.classes;

import aula02.interfaces.FuncaoTrabalhador;

public class FuncaoTrabalhorImplementada implements FuncaoTrabalhador {//Implementando a interface
    @Override
    public String digaOla() {
        return "Ola";
    }

    @Override//Sobrescrevendo, colocando o método da forma que precisa para esta classe.
    public String digaTchau() {
        return "Tchau";
    }

    // Não tem construtor declarado, mas existe o implicito, que seria um construtor vazio.
}
