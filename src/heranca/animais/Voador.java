package heranca.animais;
// Esta classe herda tudo que vem da classe Animal

public class Voador extends Animal{

    // Construtor da classe Voador. Recebe um parâmetro nome e chama o construtor da superclasse Animal usando a palavra-chave super, passando o parâmetro nome. Isso permite que a classe Voador inicialize o nome do animal.
    public Voador(String nome) {
        super(nome);
    }
    public void voar(){
        // Imprime uma mensagem indicando que o animal voou
        System.out.printf("%s voou\n", getNome());
    }
}
