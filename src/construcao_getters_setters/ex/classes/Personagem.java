package construcao_getters_setters.ex.classes;

import javax.swing.*;

public class Personagem {
// atributos de classe
    // metodo construtor
    //Metodos especificos
    //metodos getters e setters

    // atributos da classe
    private String nome;
    private  int nivel;
    private int forca;
    private int vida;
    private String classe;

    // metodo construtor
    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 1000;

            if(classe.equals("Guerreiro")) {
                forca = 500 + nivel * 2;
            } else {
                forca = 500 + nivel;
            }
    }

    // metodo especifico
    public void mostrarStatus(){
        String status = String.format("Nome: %s \nNivel: %d\nVida: %d\nClasse: %s\nForca: %d", nome,nivel,vida,classe,forca);
        JOptionPane.showMessageDialog(null, status, "Personagem criado:", JOptionPane.INFORMATION_MESSAGE);
    }


    //metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
