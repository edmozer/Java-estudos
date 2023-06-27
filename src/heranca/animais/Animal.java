package heranca.animais;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        // Imprime uma mensagem indicando que o animal comeu
        System.out.printf("%s comeu\n", nome);
    }

    public void beber() {
        // Imprime uma mensagem indicando que o animal bebeu
        System.out.printf("%s bebeu\n", nome);
    }

    public String getNome() {
        // Retorna o nome do animal
        return nome;
    }

    public void setNome(String nome) {
        // Define um novo nome para o animal
        this.nome = nome;
    }
}
