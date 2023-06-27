package heranca;
import heranca.animais.*;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Cachorro com o nome "Caramelo"
        Cachorro cachorro = new Cachorro("Caramelo");

        // Chamada do método comer() no objeto cachorro
        cachorro.comer();

        // Chamada do método latir() no objeto cachorro
        cachorro.latir();

        // Criação de um objeto Gato com o nome "Snowbell"
        Gato gato = new Gato("Snowbell");

        // Chamada do método miar() no objeto gato
        gato.miar();

        // Criação de um objeto Dragao com o nome "Dragao branco de olhos azuis"
        Dragao dragao = new Dragao("Dragao branco de olhos azuis");

        // Chamada do método voar() no objeto dragao
        dragao.voar();

        // Chamada do método soltarFogo() no objeto dragao
        dragao.soltarFogo();

        // Criação de um objeto Pombo com o nome "Pombo correio"
        Pombo pombinha = new Pombo("Pombo correio");

        // Chamada do método enviarCarta() no objeto pombinha
        pombinha.enviarCarta();

        // Chamada do método fazerPRUUU() no objeto pombinha
        pombinha.fazerPRUUU();
    }
}