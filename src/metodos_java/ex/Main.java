package metodos_java.ex;
public class Main {
    public static void main(String[] args) throws Exception {

        Personagem player = new Personagem();
        player.nome = "Eleven";
        player.nivel = Integer.parseInt("5");
        player.attack = Integer.parseInt("50");

        player.mostrarStatus();

        player.atacar("Demogorgon", "Telekinesis");

    }
}