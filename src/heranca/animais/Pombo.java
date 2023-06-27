package heranca.animais;
// pombo herda voador
public class Pombo extends Voador {
    private int cartasEnviadas;
//Construtor da classe Pombo. Recebe um parâmetro nome e chama o construtor da superclasse Voador usando a palavra-chave super, passando o parâmetro nome. Isso permite que a classe Pombo inicialize o nome do animal.
    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPRUUU() {
        // Imprime uma mensagem indicando que o pombo fez "PRUUUUUUUUUU"
        System.out.printf("%s fez PRUUUUUUUUUU\n", getNome());
    }

    public void enviarCarta() {
        // Imprime uma mensagem indicando que o pombo enviou uma carta
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        // Retorna o número de cartas enviadas pelo pombo
        return cartasEnviadas;
    }
}
