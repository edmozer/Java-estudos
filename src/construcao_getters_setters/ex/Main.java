package construcao_getters_setters.ex;

import construcao_getters_setters.ex.classes.Personagem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null,"Digite a classe do personagem: \n- Guerreiro\n- Arqueiro\n- Mago");


        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();

    }


}