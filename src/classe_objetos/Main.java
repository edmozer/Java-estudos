package classe_objetos;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogador jogadorA = new Jogador();
        jogadorA.nome = "Neymar Jr.";
        jogadorA.clubeatual = "PSG";
        jogadorA.nivel = " um craque";

        Jogador jogadorB = new Jogador();
        jogadorB.nome = "Messi";
        jogadorB.clubeatual = "Inter Miami";
        jogadorB.nivel = "uma lenda";

        Jogador jogadorC = new Jogador();
        jogadorC.nome = "Haaland";
        jogadorC.clubeatual = "Manchester City";
        jogadorC.nivel = "um monstro";

        Jogador jogadorD = new Jogador();
        jogadorD.nome = "Silvio Romero";
        jogadorD.clubeatual = "Fortaleza";
        jogadorD.nivel = "matador nato";

        System.out.format("O jogador %s esta atualmente no %s e eh %s\n", jogadorA.nome, jogadorA.clubeatual, jogadorA.nivel);
        System.out.format("O jogador %s esta atualmente no %s e eh %s\n", jogadorB.nome, jogadorB.clubeatual, jogadorB.nivel);
        System.out.format("O jogador %s esta atualmente no %s e eh %s\n", jogadorC.nome, jogadorC.clubeatual, jogadorC.nivel);
        System.out.format("O jogador %s esta atualmente no %s e eh %s\n", jogadorD.nome, jogadorD.clubeatual, jogadorD.nivel);
    }
}