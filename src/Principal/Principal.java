package Principal;

import javax.swing.JFrame;

import view.MainFrame;

public class Principal {

    public static void main(String[] args) {
        MainFrame tela = new MainFrame();
        tela.iniciar();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // comportamento ao fechar a janela
        tela.setSize(975, 550);
        tela.setLocationRelativeTo(null); // Centralizar a janela
        tela.setVisible(true);
    }

}