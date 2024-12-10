//package util;
package view;

import java.awt.*;
import javax.swing.*;

public class IconeApp {
    // Método estático para definir o ícone da aplicação
    public static void setIcon(JFrame frame) {
        // Definindo o caminho para o ícone
        ImageIcon icone = new ImageIcon("src\\view\\senac-logo.png");  // Substitua o caminho conforme necessário

        // Setando o ícone da janela
        frame.setIconImage(icone.getImage());
    }
}