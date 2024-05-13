package Principal;

import javax.swing.JFrame;

import View.MainFrame;

public class Principal {

    public static void main(String[] args) {
        /* Abrir tela do Aplicativo Neon Knight Club */
        MainFrame tela = new MainFrame();
        tela.iniciar();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // comportamento ao fechar a janela
        tela.setSize(1450, 875);
        tela.setLocationRelativeTo(null); // Centralizar a janela
        tela.setVisible(true);
    }

}