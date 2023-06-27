package heranca.animais;

public class Dragao extends Voador {

    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        // Imprime uma mensagem indicando que o dragão soltou fogo
        System.out.printf("%s soltou fogo\n", getNome());
    }
}
