package heranca.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        // Imprime uma mensagem indicando que o cachorro latiu
        System.out.printf("%s latiu\n", getNome());
    }

    public void lamber() {
        // Imprime uma mensagem indicando que o cachorro lambeu
        System.out.printf("%s lambeu\n", getNome());
    }
}
