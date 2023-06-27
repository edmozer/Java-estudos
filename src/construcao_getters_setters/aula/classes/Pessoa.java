package construcao_getters_setters.aula.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    public Pessoa(String nome, int idade, float altura, float peso, String apelido, boolean estaCadastrado) {
        System.out.println("Uma pessoa acaba de nascer! Parabens!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.apelido = apelido;
        this.estaCadastrado = estaCadastrado;
    }

    public void imprimirDados() {
        System.out.format("Nome: %s, idade = %d, altura = %.2fm, peso %.0fkg e apelido %s. \n", nome, idade, altura, peso, apelido); //".2" antes do f eh para que o numero tenha apenas duas casas decimais apos .
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public boolean getEstaCadastrado() {
        return estaCadastrado;
    }

    public void setEstaCadastrado(boolean estaCadastrado) {
        this.estaCadastrado = estaCadastrado;
    }

}
