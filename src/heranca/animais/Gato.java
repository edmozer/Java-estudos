package heranca.animais;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        // Imprime uma mensagem indicando que o gato miou
        System.out.printf("%s miou\n", getNome());
    }
}
