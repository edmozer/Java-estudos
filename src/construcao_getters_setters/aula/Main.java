package construcao_getters_setters.aula;
import construcao_getters_setters.aula.classes.Pessoa;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao II", 97, 1.75f, 110, "Matador", true);
        pessoa.imprimirDados();


       /* System.out.format(
                "nome: %s, idade = %d e %.2fm",
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getAltura()
        );*/
    }
}
